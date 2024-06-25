package com.itheima.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.mp.mapper.UserMapper;
import com.itheima.mp.pojo.User;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.util.resources.cldr.ii.CurrencyNames_ii;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ItheimaMybatisSpringbootApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelect() {
		List<User> users = this.userMapper.selectList(null);
		for (User user : users){
			System.out.println(user);
		}
	}

	@Test
	public void testInsertt() {
		for (int i = 0; i < 10; i++) {
			User user1 = new User();
			user1.setName("tomtom" + i);
			user1.setAge(20 + i);
			//user1.setPassword("321");
			user1.setUser_name("tomtom" + i);
			user1.setEmail("tomtom" + i + "@itheima.com");

			int insert = this.userMapper.insert(user1);
			System.out.println("insert="+ insert);

			//获取自增长后的值，自增长后的id值会回填到user对象中
			System.out.println("id=" + user1.getId());
		}
	}

	@Test
	public void testInsert() {
		for (int i = 0; i < 10; i++) {
			User user1 = new User();
			user1.setName("tom"+ i);
			user1.setAge(10+i);
			user1.setPassword("321");
			this.userMapper.insert(user1);
		}
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setName("james" + i);
			user.setAge(20+i);
			user.setPassword("321");
			this.userMapper.insert(user);
		}
	}

	@Test
	public void testUpdateById() {
		User user1 = new User();
		user1.setId(5L);
		user1.setName("tom4");
		user1.setPassword("321");

		int i = this.userMapper.updateById(user1);
		System.out.println("i=" + i);

	}

	@Test
	public void testUpdateQueryWrapper() {
		User user1 = new User();
		user1.setPassword("123");

		QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
		//这里是只修改指定的条件，如果没有指定这个条件，就是所有的数据都会同时修改
		userQueryWrapper.eq("username", "tom4");

		int i = this.userMapper.update(user1, userQueryWrapper);
		System.out.println("i=" + i);

	}

	@Test
	public void testUpdateWrapper() {
		/* User user1 = new User();
		user1.setPassword("123");

		UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
		int i = this.userMapper.update(user1, updateWrapper);
		System.out.println("i=" + i);
		*/

		UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
		//这里是只修改指定的条件，如果没有指定这个条件，就是所有的数据都会同时修改
		updateWrapper.eq("id", 6).set("password",321321).set("username", "tom6");

		int i = this.userMapper.update(null, updateWrapper);
		System.out.println("i=" + i);

	}

	@Test
	public void testDeleteById(){
		int delete = this.userMapper.deleteById(10);
		System.out.println("delete=" + delete);

	}

	@Test
	public void testDeleteByMap(){

		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("username", "james5555");
		hashMap.put("password", "123");
		int i = this.userMapper.deleteByMap(hashMap);
		System.out.println("i=" + i);


	}

	@Test
	public void testDelete(){
		//1,
		/* QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("username", "james5555").eq("password", "321"); */

		//2,
		User user = new User();
		user.setId(7L);
		user.setName("tom7");
		user.setPassword("321");

		QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);

		int i = this.userMapper.delete(queryWrapper);
		System.out.println("i=" + i);

	}

	@Test
	public void testDeleteByIds(){
		List<Long> list = new ArrayList<>();
		for (Long i = 1L; i <= 4L; i++) {
			list.add(i);
		}


		int i = this.userMapper.deleteBatchIds(list);
		System.out.println("i=" + i);

		/* int i1 = this.userMapper.deleteBatchIds(Arrays.asList(3L, 4L));
		System.out.println("i1=" + i1); */
	}

	@Test
	public void testSelectById(){
		//testInsert();
		User user = this.userMapper.selectById(10L);
		System.out.println("user=" + user);


	}

	@Test
	public void testSelectBatchIds(){

		List<Long> arrayList = new ArrayList<>();
		for (Long i = 12L; i <= 31L ; i++) {
			arrayList.add(i);

		}
		List<User> users = this.userMapper.selectBatchIds(arrayList);
		for (User user : users){
			System.out.println("user=" + user);
		}



	}

	@Test
	public void testSelectOne(){

		/* User user1 = new User();
		user1.setName("james9");
		user1.setPassword("321");
 */

		QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
		userQueryWrapper.eq("username", "tom4");

		User user = this.userMapper.selectOne(userQueryWrapper);
		System.out.println(user);


	}

	@Test
	public void testSelectCount(){

		QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
		userQueryWrapper.gt("username", "james0");
		Integer count = this.userMapper.selectCount(userQueryWrapper);
		System.out.println("count=" + count);

	}

	@Test
	public void testSelectList(){

		QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
		userQueryWrapper.like("username", "james8");

		List<User> users = this.userMapper.selectList(userQueryWrapper);
		for (User user : users){
			System.out.println("user=" + user);
		}

	}

	@Test
	public void testSelectPage(){

		Page<User> page = new Page<>(1, 3);

		QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
		userQueryWrapper.like("username", "james");

		IPage<User> userIPage = this.userMapper.selectPage(page, userQueryWrapper);
		System.out.println("数据总条数：" + userIPage.getTotal());
		System.out.println("数据总页数：" + userIPage.getPages());
		System.out.println("当前页数：" + userIPage.getCurrent());
		System.out.println("当前size：" + userIPage.getSize());

		List<User> records = userIPage.getRecords();
		for (User user : records){
			System.out.println(user);
		}


	}


	@Test
	public void testFindById(){
		User user = this.userMapper.findById(15L);
		System.out.println(user);
	}

	@Test
	public void testAllEq(){

		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("username", "james5");
		hashMap.put("password", null);

		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		//queryWrapper.allEq(hashMap);//where password is NULL and name = ?
		//queryWrapper.allEq(hashMap, false);//where name = ?

		//queryWrapper.allEq((k, v) -> (k.equals("id") || k.equals("username")), hashMap, false);
		queryWrapper.allEq((k, v) -> (k.equals("id") || k.equals("username")), hashMap);

		List<User> users = this.userMapper.selectList(queryWrapper);
		for (User user: users){
			System.out.println(user);

		}
	}

	@Test
	public void testEq(){
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();

		queryWrapper.eq("password", "321")
				.in("username","james3","james6","james9","james0");
		List<User> users = this.userMapper.selectList(queryWrapper);
		for (User user: users) {
			System.out.println(user);
		}
	}

	@Test
	public void testLike(){
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.likeLeft("username","5");
		queryWrapper.orderByDesc("username");

		List<User> users = this.userMapper.selectList(queryWrapper);
		for (User user: users) {
			System.out.println(user);
		}
	}

	@Test
	public void testOr(){

		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("username","tom3").or().eq("age", "25");

		List<User> users = this.userMapper.selectList(queryWrapper);
		for (User user: users) {
			System.out.println(user);
		}
	}

	@Test
	public void testSelectt(){

		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("username","tom3").or()
				.gt("age", "25")
				.select("id", "username", "age");

		List<User> users = this.userMapper.selectList(queryWrapper);
		for (User user: users) {
			System.out.println(user);
		}
	}

	@Test
	public void testSelectAll(){

		List<User> all = this.userMapper.findAll();
		for (User user : all) {
			System.out.println("user =>" + user);
		}
	}

}
