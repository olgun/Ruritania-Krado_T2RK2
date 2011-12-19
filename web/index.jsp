<%@page import="java.util.List"%>
<%@page import="cs.ut.ee.esi.controller.T2RK2ModelAndViewController"%>
<%@page import="org.project.t2rk2.T2RK2"%>
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
        </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ESI Semester Project T2RK2</title>
    </head>
    <body>
    <div align="center" >
        <h3>Ruritania Krado Agency</h3>
        </div>
        <div align="left" >
            
            <a href="index.jsp"> Ruritania Krado </a> <br/>
            <a href="t2es1.jsp">T2ES1 </a> <br/>
            <a href="t2es2.jsp">T2ES2 </a> <br/>
            <a href="t2no1.jsp">T2NO1 </a> <br/>
            <a href="t2no2.jsp">T2NO2 </a>
            <br/>
           
            <br><br><br>
            </div>
            <div align="center">
            <%
                        T2RK2ModelAndViewController view = new T2RK2ModelAndViewController();
                        List<cs.ut.ee.esi.domain.MeteredData> meteredData = view.getDailyMeteredDataForDisplay();

                        out.println("<table border=1>");
                        out.println("<tr colspan=7 class=\"HeadingColor\"><a name=DailyMeteredData>Daily Metered Data</a></tr>");
                        out.println("<tr class=\"HeadingColor\"> ");
                        out.println("<td class=\"GridHeadings\"> Network Owner ID </td>");
                        out.println("<td class=\"GridHeadings\"> Start Date </td>");
                        out.println("<td class=\"GridHeadings\"> End Date </td>");
                        out.println("<td class=\"GridHeadings\"> Electricity User ID </td>");
                        out.println("<td class=\"GridHeadings\"> Consumed Energy </td>");
                        out.println("<td class=\"GridHeadings\"> Supplier ID </td>");
                        out.println("<td class=\"GridHeadings\"> Supplied Energy </td>");
                        out.println("</tr>");

                        if (meteredData != null && meteredData.size() != 0) {

                            for (cs.ut.ee.esi.domain.MeteredData data: meteredData) {
                                out.println("<tr>");
                                out.println("<td class=\"GridRow\">" + data.getNetworkOwner().getNetworkOwnerID() + "</td>");
                                out.println("<td class=\"GridRow\">" + data.getStartDate() + "</td>");
                                out.println("<td class=\"GridRow\">" + data.getEndDate() + "</td>");
                                out.println("<td class=\"GridRow\">" + data.getExitPoint().getUserID() + "</td>");
                                out.println("<td class=\"GridRow\">" + data.getExitPoint().getUsedEnergy() + "</td>");
                                out.println("<td class=\"GridRow\">" + data.getEntryPoint().getElectricitySupplier().getElectricitySupplierID() + "</td>");
                                out.println("<td class=\"GridRow\">" + data.getEntryPoint().getProvidedEnergy() + "</td>");
                                out.println("</tr>");
                            }
                        }

                        out.println("</table><br><br>");

                        List<cs.ut.ee.esi.domain.ConsumptionForecast> forecastedConsumption = view.getConsumptionForecastForDisplay();

                        out.println("<table border=1>");
                        out.println("<tr colspan=7 class=\"HeadingColor\"><a name=ConsumptionForecast>Consumption Forecast</a></tr>");
                        out.println("<tr class=\"HeadingColor\">");
                        out.println("<td class=\"GridHeadings\"> Supplier ID </td>");
                        out.println("<td class=\"GridHeadings\"> Date </td>");
                        out.println("<td class=\"GridHeadings\"> Forecasted Consumption </td>");
                        out.println("</tr>");

                        if (forecastedConsumption != null && forecastedConsumption.size() != 0) {

                            for (cs.ut.ee.esi.domain.ConsumptionForecast fc: forecastedConsumption) {
                                out.println("<tr>");
                                out.println("<td class=\"GridRow\">" + fc.getElectricitySupplier().getElectricitySupplierID() + "</td>");
                                out.println("<td class=\"GridRow\">" + fc.getForecastDate() + "</td>");
                                out.println("<td class=\"GridRow\">" + fc.getPredictedConsumption() + "</td>");
                                out.println("</tr>");
                            }
                        }

                        out.println("</table><br><br>");

                        List<cs.ut.ee.esi.domain.ConsumptionPlan> consumptionPlan = view.getConsumptionPlanForDisplay();

                        out.println("<table border=1>");
                        out.println("<tr colspan=7 class=\"HeadingColor\"><a name=ConsumptionPlan>Consumption Plans</a></tr>");
                        out.println("<tr class=\"HeadingColor\">");
                        out.println("<td class=\"GridHeadings\"> Supplier ID </td>");
                        out.println("<td class=\"GridHeadings\"> Date </td>");
                        out.println("<td class=\"GridHeadings\"> Planned Consumption </td>");
                        out.println("</tr>");

                        if (consumptionPlan != null && consumptionPlan.size() != 0) {

                            for (cs.ut.ee.esi.domain.ConsumptionPlan cp : consumptionPlan ) {
                                out.println("<tr>");
                                out.println("<td class=\"GridRow\">" + cp.getElectricitySupplier().getElectricitySupplierID() + "</td>");
                                out.println("<td class=\"GridRow\">" + cp.getPlanDate() + "</td>");
                                out.println("<td class=\"GridRow\">" + cp.getConsumptionValue() + "</td>");
                                out.println("</tr>");
                            }
                        }

                        out.println("</table><br><br>");

                        List<cs.ut.ee.esi.domain.LoadProfile> loadProfile = view.getLoadProfileForDisplay();

                        out.println("<table border=1>");
                        out.println("<tr colspan=7 class=\"HeadingColor\"><a name=LoadProfile>Profiles</a></tr>");
                        out.println("<tr class=\"HeadingColor\">");
                        out.println("<td class=\"GridHeadings\"> Network Owner ID </td>");
                        out.println("<td class=\"GridHeadings\"> Date </td>");
                        out.println("<td class=\"GridHeadings\"> Hour </td>");
                        out.println("<td class=\"GridHeadings\"> Hourly Load </td>");
                        out.println("</tr>");

                        if (loadProfile != null && loadProfile.size() != 0) {

                            for (cs.ut.ee.esi.domain.LoadProfile lp: loadProfile) {
                                out.println("<tr>");
                                out.println("<td class=\"GridRow\">" + lp.getNetworkOwner().getNetworkOwnerID() + "</td>");
                                out.println("<td class=\"GridRow\">" + lp.getDate() + "</td>");
                                out.println("<td class=\"GridRow\">" + lp.getHour() + "</td>");
                                out.println("<td class=\"GridRow\">" + lp.getHourlyValue() + "</td>");
                                out.println("</tr>");
                            }
                        }

                        out.println("</table><br><br>");

                        List<cs.ut.ee.esi.domain.LoadProfileShares> loadProfileShare = view.getLoadProfileShareForDisplay();

                        out.println("<table border=1>");
                        out.println("<tr colspan=7 class=\"HeadingColor\"><a name=LoadProfileShare>Profile Shares</a></tr>");
                        out.println("<tr class=\"HeadingColor\">");
                        out.println("<td class=\"GridHeadings\"> Network Owner ID </td>");
                        out.println("<td class=\"GridHeadings\"> Supplier ID </td>");
                        out.println("<td class=\"GridHeadings\"> Provider ID </td");
                        out.println("<td class=\"GridHeadings\"> Profile Settlement Area ID </td>");
                        out.println("<td class=\"GridHeadings\"> Calculation Stage </td>");
                        out.println("<td class=\"GridHeadings\"> Supply Month </td>");
                        out.println("<td class=\"GridHeadings\"> High Load Profile Share </td>");
                        out.println("<td class=\"GridHeadings\"> Low Load Profile Share </td>");
                        out.println("</tr>");

                        if (loadProfileShare != null && loadProfileShare.size() != 0) {

                            for (cs.ut.ee.esi.domain.LoadProfileShares lps : loadProfileShare) {
                                out.println("<tr>");
                                out.println("<td class=\"GridRow\">" + lps.getNetworkOwner().getNetworkOwnerID() + "</td>");
                                out.println("<td class=\"GridRow\">" + lps.getElectricitySupplier().getElectricitySupplierID() + "</td>");
                                out.println("<td class=\"GridRow\">" + lps.getBalanceProvider().getBalanceProviderID() + "</td>");
                                out.println("<td class=\"GridRow\">" + lps.getProfileSettlementAreaID() + "</td>");
                                out.println("<td class=\"GridRow\">" + lps.getCalculationStage() + "</td>");
                                out.println("<td class=\"GridRow\">" + lps.getSupplyMonth() + "</td>");
                                out.println("<td class=\"GridRow\">" + lps.getHighLoadProfileShare() + "</td>");
                                out.println("<td class=\"GridRow\">" + lps.getLowLoadProfileShare() + "</td>");
                                out.println("</tr>");
                            }
                        }

                        out.println("</table><br><br>");

            %>
        </div>
    </body>
</html>