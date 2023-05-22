# API de Fornecedores

Esta API é responsável por gerenciar fornecedores em uma aplicação de farmácia. Ela fornece rquisições para cadastrar, buscar, listar, atualizar e inativar fornecedores.


## Requisições da API

Ao utilizar esta API, é importante fornecer as informações necessárias no corpo de cada requisição, conforme descrito abaixo:

### Cadastrar um novo fornecedor

Método: `POST`

URL: `/fornecedor`

Descrição: Este método permite cadastrar um novo fornecedor na base de dados. Imagine uma página de cadastro de fornecedor com os campos Cnpj, Nome, e endereço. Esses campos serão preenchidos pelo usuário e logo apos esses dados inseridos serão validados.

### Buscar fornecedor pelo CNPJ

Método: `GET`

URL: `/fornecedor/{id}`

Descrição: Este método retorna os dados de um fornecedor com base no seu CNPJ. Imagine uma tela onde tem-se o campo para inserir o CNPJ e o mesmo retorna os dados(Cnpj, Nome, e endereço).

### Listar todos os fornecedores

Método: `GET`

URL: `/fornecedor`

Descrição: Este método retorna uma lista com todos os fornecedores cadastrados. Imagine-se em uma página que ao clicar num botão ou selecionar uma opção de listar Fornecedores o mesmo puxará todos cadastrados na base de dados.

### Atualizar um fornecedor pelo CNPJ

Método: `PUT`

URL: `/fornecedor/{id}`

Descrição: Este método permite atualizar os dados de um fornecedor existente com base no seu CNPJ. Imagine que você precisa atualizar dados de um fornecedor. Poderiamos ter uma página com os campos para buscar esse cnpj e se o mesmo for encontrado na base de dados te dará possibilidade de atulizar os dados.

### Inativar um fornecedor pelo CNPJ

Método: `DELETE`

URL: `/fornecedor/{id}`

Descrição: Este método inativa um fornecedor com base no seu CNPJ. Imagine um fornecedor que está cadastrado na base de dados, porém depois de um tempo ele parou de prestar serviço para você. Diante disso você que queria deletar os dados dele, porém pensando na possibilidade desse fornecedor voltar a prestar serviço você decide deixar ele inativo na base de dados mantendo o dados dele ainda no banco.

______________________________________________________________________________________________________________________________________________________________________________________________


# API de Produtos

Esta API é responsável por gerenciar produtos em uma aplicação de mercado. Ela fornece requisições para cadastrar, buscar, listar, atualizar e inativar produtos.

## Requisições da API

Ao utilizar esta API, é importante fornecer as informações necessárias no corpo de cada requisição, conforme descrito abaixo:

## Cadastrar um novo produto

Método: `POST`

URL: `/produto`

Descrição: Este método permite cadastrar um novo produto na base de dados. Os campos necessários para o cadastro são: nome, descrição, preço e status de ativo. Ao realizar a requisição, os dados do produto serão inseridos na base de dados.

## Buscar produto por ID

Método: `GET`

URL: `/produto/{id}`

Descrição: Este método retorna os dados de um produto com base no seu ID. Ao informar o ID do produto na URL, será retornado o produto correspondente, incluindo informações como nome, descrição, preço e status de ativo.

## Listar todos os produtos

Método: GET

URL: `/produto`

Descrição: Este método retorna uma lista com todos os produtos cadastrados. Ao realizar a requisição, será retornado um array de produtos contendo informações como nome, descrição, preço e status de ativo.

## Atualizar um produto por ID

Método: PUT

URL: `/produto/{id}`

Descrição: Este método permite atualizar os dados de um produto existente com base no seu ID. Ao informar o ID do produto na URL e enviar os novos dados no corpo da requisição, o produto correspondente será atualizado na base de dados com as informações fornecidas.

## Inativar um produto por ID

Método: DELETE

URL: /produto/{id}

Descrição: Este método inativa um produto com base no seu ID. Ao informar o ID do produto na URL, o produto correspondente será marcado como inativo na base de dados, mantendo seus dados, mas indicando que não está mais disponível.

______________________________________________________________________________________________________________________________________________________________________________________________
