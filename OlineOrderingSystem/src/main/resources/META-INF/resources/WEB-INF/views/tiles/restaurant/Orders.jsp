<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Orders</title>
</head>
<body>
<%-- 	<section>
      <div class="jumbotron">
        <div class="container">
          <h1>Your Orders</h1>
          	 <c:forEach items="${orders}" var="order">
          	 	<div class="caption">
                         <h3>${order.orderDate}</h3>
                              	<div class="col-sm-6 col-md-3">
	                              	<c:forEach items="${order.orderDetail}" var="orderDetail">
	                              		<h3>${orderDetail.food.name}</h3>
	                              		<h3>${orderDetail.food.price}</h3>
	                              		<h3>${orderDetail.qty}</h3>
	                              	</c:forEach>
                              	</div>
                             </div>
          	 
          	 </c:forEach>



        </div>
        <a href="<spring:url value="restaurantList" />" class="btn btn-default">
          <span class="glyphicon-hand-right glyphicon"></span> Continue shopping
        </a>
      </div>
    </section> --%>
    
    
   <section class="container">
        	<h1>Your Orders</h1>
            <div class="row">
                <c:forEach items="${orders}" var="order"> 
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail">
                        	<p>Order Date</p> <h5>${order.orderDate}</h5>
                            <div class="caption">
                              	<div class="col-sm-6 col-md-3">
	                              	<c:forEach items="${order.orderDetail}" var="orderDetail">
	                              		Food Name <h4>${orderDetail.food.name}</h3>
	                              		<p>Price</p><h3>${orderDetail.food.price}</h3>
	                              		<p>QTY</p><h3>${orderDetail.qty}</h3>
	                              	</c:forEach>
                              	</div>
                               
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
        

</body>
</html>