package home.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by lucode on 2017/4/29.
 */
public class User extends ActionSupport {
    public String login() {
        try {
            HttpServletRequest request = ServletActionContext.getRequest();
            HttpServletResponse response = ServletActionContext.getResponse();
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=utf-8");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            //页面跳转  测试作用 用户名和密码  写死了
            if ("admin".equals(username) && "1".equals(password)) {
                return SUCCESS;
            } else {
                //return "login";
                return  LOGIN;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
