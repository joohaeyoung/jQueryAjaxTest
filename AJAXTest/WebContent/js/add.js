function callServer(){
	
	//javaScript로 서버쪽 프로그램을 호출.( ajax )
	//ajax 를 이용해서 처리해 보아요.!
	//순수 javascript가 아닌 jQuery로 ajax를 사용.
	
	//뭔가 선택할 필요가없다. 서버쪽 프로그램을 호출하기떄문에.
	
	$.ajax( {
		
		//호출할 서버족 프로그램의 url
		url : "http://localhost:8181/ajax/add",
		
		//type : 전송방식
		type : "get",
			
		//data : 서버로 전송할 데이터 ( 객체로 전달하자 )
		data : {
			
			first : $("#first").val(), //서버쪽의 getParameter의 값과 같아야 한다.	
			second : $("#second").val() //서버쪽의 getParameter의 값과 같아야 한다.
			
		},
	
	   success : function(data){//ajax 호출이 성공하면 서버에 보내준 데이터가 함수 인자로 박힘
		   
		   $("span").text(data); //화면처리여기서 한다. 
		    
	   },
	   
	   error : function(){
		   alert("먼가 이상함");
	   }
			
	}  );
	
	
}