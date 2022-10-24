


// sistema de login
class Funcionario{ String nome; }

class Gerente extends Funcionario { int senha; } // faz login com nome, senha

class Secretaria extends Funcionario { int cod_estacao; } // faz login com nome, cod_estacao

class telefonista extends Funcionario { int ramal; } // faz login com nome, ramal 
