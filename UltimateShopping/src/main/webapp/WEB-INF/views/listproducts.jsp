<div class="container">

	<div class="row">

		<!-- would be display sidebar -->

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!-- To display actual bar -->

		<div class="col-md-9">

			<!-- added breadcrumb component -->

			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true }">

						<ol class="breadcrumb">

							<li class="home"><a class="nav-link"
								href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>

						</ol>

					</c:if>

					<c:if test="${userClickCtegoryProducts == true }">

						<ol class="breadcrumb">

							<li class="home"><a class="nav-link"
								href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>

						</ol>

					</c:if>

				</div>

			</div>

		</div>

	</div>




</div>