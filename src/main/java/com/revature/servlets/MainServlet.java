package com.revature.servlets;

import com.revature.util.RequestHelper;
import com.revature.util.ResourceNotFoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestHelper.getProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        RequestHelper.postProcess(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        RequestHelper.putProcess(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        try {
            RequestHelper.deleteProcess(request, response);
        } catch (ResourceNotFoundException e) {
            response.sendError(422, "Record with that ID does not exist.");
        }
    }
}
