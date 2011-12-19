
<%@page import="cs.ut.ee.esi.controller.GeneralViewController"%>
<%@page import="org.project.t2rk2.T2ES2"%>
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
        <title>T2ES2</title>
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
          

            <form action="t2es2.jsp" method="post">
                <table border="1">
                    <tr class="HeadingColor">
                        <td colspan="2" class="GridHeadings">Annual Consumption Report:</td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Message ID*</label></td>
                        <td><input type="text" name="messageID" value="1"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Name*</label></td>
                        <td><input type="text" name="name" value="Olgun"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Phone*</label></td>
                        <td><input type="text" name="phone" value="11112222"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Postal Address*</label></td>
                        <td><input type="text" name="postalAddress" value="Tartu"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Start Date*</label></td>
                        <td><input type="text" name="startDate" value="2011-12-12 00:00:00"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">End Date*</label></td>
                        <td><input type="text" name="endDate" value="2011-12-12 00:00:00"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td>&nbsp;</td>
                        <td><input type="submit" value="submit"></td>
                    </tr>
                </table>
            </form>
            <br><br>
            <form action="t2es2.jsp" method="post">
                <table border="1">
                    <tr class="HeadingColor">
                        <td colspan="2" class="GridHeadings">Balance Invoice:</td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Message ID*</label></td>
                        <td><input type="text" name="messageID" value="1"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Recipient*</label></td>
                        <td><input type="text" name="recipient"/></td>
                    </tr>
                    <tr class="HeadingColor">
                        <td><label for="keyword" class="GridHeadings">Date*</label></td>
                        <td><input type="text" name="dated" value="2011-12-12 00:00:00"/></td>
                    </tr>

                    <tr>
                        <td>&nbsp;</td>
                        <td><input type="submit" value="submit"></td>
                    </tr>
                </table>
            </form>

            <%
                        if (request != null) {

                            GeneralViewController view = new GeneralViewController();

                            if (((request.getParameter("messageID") != null)
                                    && (!request.getParameter("messageID").isEmpty()))
                                    && ((request.getParameter("phone") != null)
                                    && (!request.getParameter("phone").isEmpty()))
                                    && ((request.getParameter("postalAddress") != null)
                                    && (!request.getParameter("postalAddress").isEmpty()))
                                    && ((request.getParameter("name") != null)
                                    && (!request.getParameter("name").isEmpty()))
                                    && ((request.getParameter("startDate") != null)
                                    && (!request.getParameter("startDate").isEmpty()))
                                    && ((request.getParameter("endDate") != null)
                                    && (!request.getParameter("endDate").isEmpty()))) {
                                out.println("<br><span class=\"h1\">" + view.submitAnnualConsumptionReport(request.getParameter("messageID"), request.getParameter("phone"), request.getParameter("postalAddress"), request.getParameter("name"), request.getParameter("startDate"), request.getParameter("endDate")) + "</span><br>");
                            }
                            /*else {
                                out.println("Failure: Please specify Supplier ID first!<br>");
                            }*/

                            if (((request.getParameter("dated") != null)
                                    && (!request.getParameter("dated").isEmpty()))
                                    && ((request.getParameter("messageID") != null)
                                    && (!request.getParameter("messageID").isEmpty()))
                                    && ((request.getParameter("recipient") != null)
                                    && (!request.getParameter("recipient").isEmpty()))) {
                                out.println("<br><span class=\"h1\">" + view.submitBalanceInvoice(request.getParameter("messageID"), request.getParameter("recipient"), request.getParameter("dated")) + "</span><br>");
                            }
                            /*else {
                                out.println("Failure: Missing Value(s). Please specify Date and Value first!<br>");
                            }*/
                        }
            %>
        </div>
    </body>
</html>