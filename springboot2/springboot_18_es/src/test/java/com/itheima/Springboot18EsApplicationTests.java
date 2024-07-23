package com.itheima;

import com.alibaba.fastjson.JSON;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
class Springboot18EsApplicationTests {

     @Autowired
    private BookDao bookDao;

    /*@Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;


    @Test
    void test() {
        bookDao.selectById(1);

    } */

    private RestHighLevelClient client;

    @AfterEach
    void tearDown() throws IOException {
        client.close();
    }

    @BeforeEach
    void setUp() {
        HttpHost httpHost = HttpHost.create("http://localhost:9200");
        RestClientBuilder builder = RestClient.builder(httpHost);
        client = new RestHighLevelClient(builder);
    }

    /* @Test
    void testCreateClient() throws IOException {
        HttpHost httpHost = HttpHost.create("http://localhost:9200");
        RestClientBuilder builder = RestClient.builder(httpHost);
        client = new RestHighLevelClient(builder);

        client.close();
    } */

    @Test
    void testCreateIndex() throws IOException {

        CreateIndexRequest request = new CreateIndexRequest("books");
        client.indices().create(request, RequestOptions.DEFAULT);

    }

    @Test
    void testCreateIndexByIK() throws IOException {

        CreateIndexRequest request = new CreateIndexRequest("books");
        String json = "{\n" +
                "    \"mappings\": {\n" +
                "    \"_doc\": {\n" +
                "        \"properties\": {\n" +
                "            \"id\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "            },\n" +
                "            \"name\": {\n" +
                "                \"type\": \"text\",\n" +
                "                \"analyzer\": \"ik_max_word\",\n" +
                "                \"copy_to\": \"all\"\n" +
                "            },\n" +
                "            \"type\": {\n" +
                "                \"type\": \"keyword\"\n" +
                "            },\n" +
                "            \"description\": {\n" +
                "                \"type\": \"text\",\n" +
                "                \"analyzer\": \"ik_max_word\",\n" +
                "                \"copy_to\": \"all\"\n" +
                "            },\n" +
                "            \"all\": {\n" +
                "                \"type\": \"text\",\n" +
                "                \"analyzer\": \"ik_max_word\"\n" +
                "            }\n" +
                "        }\n" +
                "        }\n" +
                "    }\n" +
                "}";
        request.source(json, XContentType.JSON);
        client.indices().create(request, RequestOptions.DEFAULT);

    }

    @Test
    void testCreateDoc() throws IOException {

        Book book = bookDao.selectById(2);

        IndexRequest request = new IndexRequest("books").id(String.valueOf(book.getId()));
        String json = JSON.toJSONString(book);
        request.source(json, XContentType.JSON);
        client.index(request, RequestOptions.DEFAULT);
    }

    @Test
    void testCreateDocAll() throws IOException {

        //Book book = bookDao.selectById(2);
        List<Book> bookList = bookDao.selectList(null);

        BulkRequest bulkRequest = new BulkRequest();

        for (Book book : bookList){
            IndexRequest request = new IndexRequest("books").id(String.valueOf(book.getId()));
            String json = JSON.toJSONString(book);
            request.source(json, XContentType.JSON);
            bulkRequest.add(request);
        }

        client.bulk(bulkRequest, RequestOptions.DEFAULT);

    }

    @Test
    void testGet() throws IOException {


        GetRequest request = new GetRequest("books", "1");
        GetResponse response = client.get(request, RequestOptions.DEFAULT);
        String sourceAsString = response.getSourceAsString();
        System.out.println(sourceAsString);
    }

    @Test
    void testSearch() throws IOException {

        SearchRequest request = new SearchRequest("books");

        SearchSourceBuilder builder = new SearchSourceBuilder();
        //builder.query(QueryBuilders.termQuery("name", "java"));
        builder.query(QueryBuilders.termQuery("all", "spring"));

        request.source(builder);

        SearchResponse searchResponse = client.search(request, RequestOptions.DEFAULT);
        SearchHits hits = searchResponse.getHits();
        for (SearchHit hit : hits){
            String sourceAsString = hit.getSourceAsString();
            //System.out.println(sourceAsString);
            Book book = JSON.parseObject(sourceAsString, Book.class);
            System.out.println(book);
        }


    }

}
