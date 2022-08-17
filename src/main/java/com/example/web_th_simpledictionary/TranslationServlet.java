package com.example.web_th_simpledictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TranslationServlet", value = "/translate")
public class TranslationServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        dictionary.put("alo", "1234");

        String search = req.getParameter("txtSearch");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");

        String result = dictionary.get(search);
        if(result != null){
            writer.println("<b>Word</b>: " + search + "<br/>");
            writer.println("<b>Result</b>: " + result);
        } else {
            writer.println("Not found");
        }

        writer.println("</html>");
    }
}
