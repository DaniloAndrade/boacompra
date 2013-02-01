

<form action='<c:url value="/produto/${produto.id}"/>' method="post">
	<fieldset>
		<legend>Alterar Produto</legend>
	</fieldset>
	<!--  <input type="hidden" name="produto.id" value="${produto.id}"/>-->
	<label for="nome">Nome:</label>
	<input type="text" name="produto.nome" id="nome" value="${produto.nome}"/>
	
	<label for="descricao">Descrição</label>
	<textarea id="descricao" name="produto.descricao" >${produto.descricao}</textarea>
	
	<label for="preco">Preço</label>
	<input id="preco" type="number" name="produto.preco" value="${produto.preco}"/>
	<button type="submit" name="_method" value="PUT">Enviar</button>

</form>