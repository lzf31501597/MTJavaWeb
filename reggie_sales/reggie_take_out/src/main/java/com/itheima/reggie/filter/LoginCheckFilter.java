package com.itheima.reggie.filter;


import com.alibaba.fastjson.JSON;
import com.itheima.reggie.common.BaseContext;
import com.itheima.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2024/05/31 17:44
 * @Description ユーザーがログインを完了したかどうかを確認する
 */
@Slf4j
@WebFilter(filterName = "/loginCheckFilter", urlPatterns = "/*")
public class LoginCheckFilter implements Filter {
    //パスマッチャー、文字の一致をサポート
    private static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //1.このリクエストのURIを取得します
        String requestURI = request.getRequestURI(); //eg:/backend/index.html
        log.info("已拦截到请求：{}", requestURI);

        //処理する必要がないリクエストパスを定義する
        String[] urls = new String[]{
          "/employee/login",
          "/employee/logout",
          "/backend/**",
          "/front/**",
          "/common/**"
        };

        //2.このリクエストを処理する必要があるかどうかを判断する
        boolean check = check(urls, requestURI);

        //3.このリクエストを処理する必要がない場合は、直接渡す
        if (check) {
            log.info("本次请求{}，不需要处理", requestURI);
            filterChain.doFilter(request, response);
            return;
        }

        //4.ログイン状態を判断し、ログインしている場合は直接渡す。
        if(request.getSession().getAttribute("employee1") != null){
            log.info("用户已登录，用户id为：{}", request.getSession().getAttribute("employee1"));

            Long loginId = (Long) request.getSession().getAttribute("employee1");
            log.info("登录操作Id：{}" + loginId);
            BaseContext.setCurrentId(loginId);

            Long id1 = Thread.currentThread().getId();
            log.info("线程id：{}" + id1);

            filterChain.doFilter(request, response);
            return;
        }

        log.info("用户未登录");
        //5.ログインしていない場合は、ログインしていないという結果を返します
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;

        /*System.out.println(request.getRequestURI());
        log.info("已拦截到请求：{}", request.getRequestURI());*/
    }


    /**
     * @Author
     * @Description 路劲匹配，检查本次请求是否需要放行
     * @param urls
     * @param requestURI
     * @return
    **/
    public boolean check(String[] urls, String requestURI){
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestURI);
            if (match) {
                return true;
            }
        }
        return false;
    }
}
