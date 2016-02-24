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
	 * 登陆过滤器实现
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

		// 如果路径中以.jsp结尾或者以/user/login开头，不过滤
		if (servletPath.endsWith(SysConst.SYS_PAGE_TYPE) || servletPath.startsWith(request.getContextPath()+SysConst.USER_LOGIN_PATH)) {
			filterChain.doFilter(request, response);
			return;
		}

		// 另外，如果路径是以"/user"开头，则使用会员的过滤
		if (servletPath.startsWith(request.getContextPath()+SysConst.USER_PATH)) {
			// 从Session中获取会员对象
			User user = (User) session.getAttribute(SysConst.USER);

			// 如果会员对象为空，则重定向到会员登陆页面
			if (user == null) {
				String toUri = request.getContextPath() + SysConst.USER_LOGIN_PATH;
				if (response != null) {
					response.sendRedirect(toUri);
					return;
				}
			}

		}

		// 执行默认方法，不过滤
		filterChain.doFilter(request, response);
	}

}
