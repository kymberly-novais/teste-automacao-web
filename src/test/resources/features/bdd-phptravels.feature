#Author: Kymberly Novais

@executa
Feature: Adicionar um novo admin
  Eu como admin desejo adicionar um novo admin 
  
@login
  Scenario: Fazer login
  Given que eu esteja no site "https://phptravels.net/admin/"
  And informo login e senha
  When clico no botao Login
  Then serei direcionado para a pagina DASHBOARD

@menu
	Scenario: CT01 Acessar ao menu
		Given que eu esteja na pagina DASHBOARD
		When seleciono o menu "accounts"
		Then exibira as categorias disponiveis para selecao
		
@categoria
	Scenario: CT02 Acessar categorias
		Given que eu esteja na categoria "admins"
		Then sera exibido a pagina "ADMINS MANAGEMENT" com as opcoes disponiveis

@novocarro
	Scenario: CT03 Adicionar admin
		Given clicar em ADD
		And preencho os dados do novo admin
		When clico no botao Submit	