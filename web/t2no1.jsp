
<%@page import="cs.ut.ee.esi.controller.GeneralViewController"%>
<%@page import="java.sql.Date"%>
<%@page import="org.project.t2rk2.T2NO1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

                  <style type="text/css">
                .Heading
{
 font-size: 17px;
 font-weight: bold;
 font-family: Century Gothic;
 color: #FFFFFF;
 background-color: #000000;
}
.GridHeadings
{
 font-size: 13px;
 font-weight: bold;
 font-family: Verdana;
 color: #6D6968;
}
.HeadingColor {
 background-color: #000000;
}

.GridText
{
 font-size: 20px;
 font-weight: normal;
 font-family: Verdana;
 color: #000000;
 background-color: #FFFFFF ;
}
.GridRow
{
 font-size: 12px;
 font-weight: normal;
 font-family: Verdana;
 color: #000000;
 background-color: #FEFFEF ;
}
.h1 {color:#800517;}
        </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>T2NO1</title>
    </head>
    <body>
        <div align="center">
        <h3>Ruritania Krado Agency</h3>
        </div>
        <div align="left">
            <br/><br/>
            <a href="index.jsp"> Ruritania Krado </a> <br/>
            <a href="t2es1.jsp">T2ES1 </a> <br/>
            <a href="t2es2.jsp">T2ES2 </a> <br/>
            <a href="t2no1.jsp">T2NO1 </a> <br/>
            <a href="t2no2.jsp">T2NO2 </a>
            <br><br><br>
        </div>


        <div align="center">
            <form action="t2no1.jsp" method="post">
                <table border="1">
                    <tr class="HeadingColor">
                        <td colspan="2" class="GridHeadings">Load Profile:</td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Area ID*</label></td>
                        <td><input type="text" name="areaID"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Network Loss Consumption*</label></td>
                        <td><input type="text" name="lossConsumption"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td>&nbsp;</td>
                        <td><input type="submit" value="submit"></td>
                    </tr>
                </table>
            </form>
            <br><br>
            <form action="t2no1.jsp" method="post">
                <table border="1">
                    <tr class="HeadingColor">
                        <td colspan="2" class="GridHeadings">Quality Series:</td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Series ID*</label></td>
                        <td><input type="text" name="seriesID"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Date*</label></td>
                        <td><input type="text" name="date" value ="2011-12-12 00:00:00"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Value*</label></td>
                        <td><input type="text" name="value"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td>&nbsp;</td>
                        <td><input type="submit" value="submit"></td>
                    </tr>
                </table>
            </form>
            <%
                        if (request != null) {
                            GeneralViewController view =new GeneralViewController();


                            if (request.getParameter("areaID") != null && !request.getParameter("areaID").isEmpty()) {
                                out.println("<br><span class=\"h1\">" + view.submitLoadProfile(request.getParameter("areaID"), Integer.parseInt(request.getParameter("lossConsumption"))) + "</span><br>");
                            }



                            if (((request.getParameter("seriesID") != null)
                                    && (!request.getParameter("seriesID").isEmpty()))
                                    && ((request.getParameter("date") != null)
                                    && (!request.getParameter("date").isEmpty()))
                                    && ((request.getParameter("value") != null)
                                    && (!request.getParameter("value").isEmpty()))) {
                                out.println("<br><span class=\"h1\">" + view.submitQualitySeries(Integer.parseInt(request.getParameter("seriesID")), request.getParameter("date"), Float.parseFloat(request.getParameter("value"))) + "</span><br>");
                            }
                        }
            %>
        </div>
    </body>
</html>