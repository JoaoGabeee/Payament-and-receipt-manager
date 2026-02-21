# Receipt Manager

A ideia base deste projeto é permitir a gestão de comprovantes de pagamento, seja de transferência ou de recebimento. Ademais será possível:

- Criar filtros;
- Fazer o download de comprovantes;
- Emitir relatórios em PDF;
- Criar categorias e perfis para organizar os comprovantes.

Essas são as ideias do projeto para primeira versão, mas com certeza terá novas funcionalidades no futuro.

## Estrutura Técnica da Aplicação

A nossa ideia é dividir a aplicação em dois grandes blocos: uma RESTful API para fazer as operações no banco feita em Java usando a framework Spring e uma aplicação web feita em python para fazer a intermediação entre o usuário e a API.

## Configuração para Desenvolvimento

### Instalação dos hooks

Iniciar o projeto auxiliar e instalar dependências:

`uv sync --no-install-project --frozen`

Instalar os hooks:

`uv run pre-commit install`
