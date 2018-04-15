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
            width: 300px;
            margin: auto;
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
        .select{
            width: 225px;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
        .ts {
            width: 300px;
            margin: auto;
        }
    </style>
</head>
<body>

<h1 align="center">Справочник городов мира</h1>

<br/>
<div>
    <table class="ts">
            <form action="">
                <th>
                <select name="item" class="select">
                    <c:forEach  items="${countries}" var ="country">
                       <option value=${country.idCountry}>${country.nameCountry}</option>
                    </c:forEach>
                </select>
                </th>
                <th>
                <input type="submit" value="Показать"/>
                </th>
            </form>

    </table>
    <br>
    <table class="tg">
        <tr>
            <th width="20">id</th>
            <th width="280">Название города</th>
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