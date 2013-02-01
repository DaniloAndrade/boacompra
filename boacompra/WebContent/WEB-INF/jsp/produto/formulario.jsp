

<form id="produtoForm" action="<c:url value='/produto'/>" method="post">
	<fieldset>
		<legend>Adicionar Produto</legend>
	</fieldset>

	<label for="nome">Nome:</label>
	<input type="text" name="produto.nome" id="nome" value="${produto.nome}" class="required" minlength="3"/>
	
	<label for="descricao">Descrição</label>
	<textarea id="descricao" name="produto.descricao" class="required" maxlength="40" minlength="5">${produto.descricao}</textarea>
	
	<label for="preco">Preço</label>
	<input id="preco" type="number" name="produto.preco" value="${produto.preco}" class="required" min="0"/>
	<button type="submit">Enviar</button>

</form>


<script>
$('#produtoForm').validate();

</script>