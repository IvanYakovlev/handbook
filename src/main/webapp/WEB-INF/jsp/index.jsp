<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=Cp1251" pageEncoding="Cp1251"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<meta http-equiv="content-type" content="text/html; charset=cp1251">
<html>
<head>
    <meta charset="UTF-8" />
    <title>Справочник</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>

<h1>Справочник городов мира</h1>

<br/><br/>
<div>
    <table>
        <td>
            <form action="">
                <select name="item"  >
                    <c:forEach  items="${countries}" var ="country">
                       <option value=${country.idCountry}>${country.nameCountry}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="Показать"/>
            </form>
        </td>
    </table>
    <br>
    <table class="tg">
        <tr>
            <th width="20">id</th>
            <th width="200">Название города</th>
        </tr>
        <c:forEach  items="${cities}" var ="city">
            <tr>
                <td>${city.idCity}</td>
                <td>${city.nameCity}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>