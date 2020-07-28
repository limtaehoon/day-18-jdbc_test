<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >
table {
	width :	600px;
	height: 400px; 
	}
table, th,td{
	border: 1px solid black;
	}
.thcolor{
background-color: green;;
}
.onType{
	list-style-type: upper-roman;
	}
</style>
</head>
<body>
<form action="eeee.jsp" method="post">
<table>
	<tr>
		<th>성명<th>
		<td><input type="text" name=name><td>
		<th>성별<th>
		<th><input type="ridio" name=man value= "남" checked>남
			<input type="radid" name=woman value= "여">여</tr>
			
	</tr>
	<tr>
		<th>생년월일</th>
		<td colspan="4"><input type="text" name =year size =15>년
		<input type="text" name=month size=5>월
		<input type="text" name=day size=5>일
		<input type="text" name=yy value="양력">양력	
		<input type="text" name=yy value="음력">음력</td>
	</tr>
	<tr>
		<th>주소</th>
		<td colspan="3"><input type="text" size=55 name =addr></td>
	</tr>
	<tr>
		<th>전화번호</th>
		<td colspan=4 ><input type="text" size=15 name=phone>-<input type="text" size=15 name=phone1>-<input type="text" size=15 name=phone2></td>
	</tr>	
	<tr>
		<th colspan=4 class="thcolor">사용가능한 프로그램 선택하기</th>
	</tr>
	<tr>
		<td colspan=4>
		<ol type="A" class = "olType">
			<li><input type="checkbox" name="pgm" value="한글">한글
			<li><input type="checkbox" name="pgm" value="포트샵">포토샵
			<li><input type="checkbox" name="pgm" value="메크로 미디어 디렉터">메크로 미디어 디렉터
			<li><input type="checkbox" name="pgm" value="드림위버">드립위버
			<li><input type="checkbox" name="pgm" value="3D MAX">3D MAX</li>
		</ol>
	</td>
	</tr>
	<tr>
		<th colspan="4" class="thcolor">가고싶은 여행지를 모두선택하세요</th>
	</tr>
	<tr>
		<td colspan="4"><select size=3 name=play multiple>
			<option value="설악산" selected></option>
			<option value="겅포대"></option>
			<option value="토발"></option>
			<option value="거제도"></option>
		 						</select>
		</td>
		</tr>
		<tr>
			<th colspan=4>
			<textarea rows="5" cols="50" name="memo">미래의 꿈은 희망입니다</textarea>
		</th>
		<th>
			<th colspan=4><input type=submit value="전송"><input type=reset name=reset value="디시쓰기"></th>
		</tr>
		
	
	
	
</table>






</form>
</body>
</html>