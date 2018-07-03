<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=Cp1251" pageEncoding="Cp1251" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<html>
<head>
    <meta charset="UTF-8"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <title>Справочник</title>

</head>
<body>
<h1 align="center">Справочник городов мира</h1>
<script TYPE="text/javascript">
    function showCities() {
        console.log($('#selCountry').val);
        $.ajax({
            url: '/showByCountry?id=' + $('#selCountry').val(),
            success: function (data) {
                var str = '<tbody>';

                data.forEach(function (city) {
                    str +=
                        '</tr>' +
                        '   <td width="20">' + city.idCity + '</td>' +
                        '   <td width="280">' + city.nameCity + '</td>' +
                        '<tr>\n';
                });
                str +=
                    '</tbody>';
                console.log(str);
                $('#tableCity').html(str);
            }
        });
    };

    function init() {
        $.ajax({
            url: '/listCountry',
            success: function (data) {
                data.forEach(function (country) {

                    $('#selCountry').append('<option value="' + country.idCountry + '">' + country.nameCountry + '</option>')
                })
            }
        });
    };
    init();
</script>

<br/>
<div>
    <table class="ts">
        <th>
            <select id="selCountry" name="item" class="select">
            </select>
        </th>

        <th>
            <button name="asd" onclick="showCities()">Показать</button>
        </th>
    </table>
    <br>
    <table class="tg" id="tableCity">
        <thead>
        <tr>
            <th width="20">id</th>
            <th width="280">Название города</th>
        </tr>
        </thead>


    </table>
</div>
</body>
</html>