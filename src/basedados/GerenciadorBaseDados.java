
package basedados;

import java.util.LinkedList;
import java.util.List;

import beans.Bolo;
import beans.BoloSimples;
import beans.BoloEspecial;
import beans.Pessoa;
import beans.Cliente;
import beans.Funcionario;
import beans.Pedido;

public interface GerenciadorBaseDados {
    
    //Inserir
    public Cliente inserirCliente(Cliente cliente) throws BaseDadosException;
    public Funcionario inserirFuncionario(Funcionario funcionario) throws BaseDadosException;
    public BoloSimples inserirBoloSimples(BoloSimples boloSimples) throws BaseDadosException;
    public BoloEspecial inserirBoloEspecial(BoloEspecial boloEspecial) throws BaseDadosException;
    public Pedido inserirPedidoBoloSimples(Pedido pedido) throws BaseDadosException;
    public Pedido inserirPedidoBoloEspecial(Pedido pedido) throws BaseDadosException;
    
    //Buscar
    public Cliente buscarCliente(int codigo) throws BaseDadosException;
    public Funcionario buscarFuncionario(int codigo) throws BaseDadosException;
    public BoloSimples buscarBoloSimples(int codigo) throws BaseDadosException;
    public BoloEspecial buscarBoloEspecial(int codigo) throws BaseDadosException;
    public Pedido buscarPedidoBoloSimples(int codigo)  throws BaseDadosException;
    public Pedido buscarPedidoBoloEspecial(int codigo)  throws BaseDadosException;
    
    //Deletar
   // public void deletarCliente(int codigo) throws BaseDadosException;
   // public void deletarFuncionario(int codigo) throws BaseDadosException;
   // public void deletarBoloSimples(int codigo) throws BaseDadosException;
   // public void deletarBoloEspecial(int codigo) throws BaseDadosException;
   // public void deletarPedido(int codigo) throws BaseDadosException;
    
    //Listar
    public List<Cliente> listarCliente() throws BaseDadosException;
    public List<Funcionario> listarFuncionario() throws BaseDadosException;
    public List<BoloSimples> listarBoloSimples() throws BaseDadosException;
    public List<BoloEspecial> listarBoloEspecial() throws BaseDadosException;
    public List<Pedido> listarPedidoBoloSimples() throws BaseDadosException;
    public List<Pedido> listarPedidoBoloEspecial() throws BaseDadosException;
}
