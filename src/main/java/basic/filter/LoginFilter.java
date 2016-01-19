package basic.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.filter.OncePerRequestFilter;

import basic.utils.SysConst;

import com.twobytes.bean.User;

/**
 * 
 * 登录过滤器
 * 
 * @Title: LoginFilter.java
 */
public class LoginFilter extends OncePerRequestFilter {

	@Override
	/**
	 * 登陆过滤器具体实现
	 */
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		// 获取Session
		HttpSession session = request.getSession();

		// 如果获取的Session为空，则返回，不走过滤器
		if (session == null) {
			return;
		}

		// 获取访问路径
		String servletPath = request.getRequestURI();

		// 如果路径中存在 .jsp 或者 存在 login字符，则直接跳转，不需要登陆验证
		if (servletPath.indexOf(".jsp") != -1 || servletPath.indexOf("login") != -1) {
			filterChain.doFilter(request, response);
			return;
		}

		// 另外，如果路径是以"/user"开头，则使用会员的过滤
		if (servletPath.startsWith(request.getContextPath() + SysConst.USER_PATH)) {
			// 从Session中获取会员对象
			User user = null;
			if (session != null) {
				user = (User) session.getAttribute(SysConst.USER);
			}

			// 如果会员对象为空，则重定向到会员登陆页面
			if (user == null) {
				String toUri = request.getContextPath() + "/user/login";
				if (response != null) {
					response.sendRedirect(toUri);
					return;
				}
			}

		}

		// 如果uri中不包含background，则继续
		filterChain.doFilter(request, response);
	}

}
