package teste;

import java.sql.Date;

public class Funcionario extends Pessoa {
    public Funcionario(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
        public double salario;
        public Date data_admissao;
        public String cargo;
		
        public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public Date getData_admissao() {
			return data_admissao;
		}
		public void setData_admissao(Date data_admissao) {
			this.data_admissao = data_admissao;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
        
        
        
        
    
    }
