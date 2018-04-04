package bookshop.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Controller",urlPatterns = {"/Controller","*.do"},initParams={@WebInitParam(
        name="propertyConfig",value = "commandMapping.properties")})
public class Controller extends HttpServlet {

    private Map<String,Object> commandMap = new HashMap<>();

    public Controller(){
        super();
    }

    //명령어와 처리 클래스가 매핑되어 있는 properties file 을 읽어서
    //HashMap 객체인 commandMap에 저장


    @Override
    public void init(ServletConfig config) throws ServletException {


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
