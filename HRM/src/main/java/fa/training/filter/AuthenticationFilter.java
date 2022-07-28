package fa.training.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {"/home", "/admin/*", "/protected/*"})
public class AuthenticationFilter implements Filter {
			
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Call filter in here");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		// Check session login in here
		String email = (String) req.getSession().getAttribute("loginUser");
		if (email == null) {
			resp.sendRedirect(req.getContextPath() + "/login");
		} else {
			chain.doFilter(request, response);
		}
	}

}
