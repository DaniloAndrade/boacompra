
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<table>
	<thead>
		<tr>
			<th>Nome</th>
			<th>Descri��o</th>
			<th>Pre�o</th>
			<th></th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="produto" items="${produtoList}">
		<tr>
			<td>${produto.nome}</td>
			<td>${produto.descricao}</td>
			<td>${produto.preco}</td>
			<td><a href='<c:url value="/produto/${produto.id}"/>'>Editar</a></td><td>
			<form action='<c:url value="/produto/${produto.id}"/>' method="post">
				<button class="link" name="_method" value="DELETE">Remover</button>
			</form><!--  <a href="remover?id=${produto.id}">Excluir</a>--></td>
		</tr>
		</c:forEach>
	</tbody>
</table>

