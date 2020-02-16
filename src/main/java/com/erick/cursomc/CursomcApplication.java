package com.erick.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.erick.cursomc.domain.Categoria;
import com.erick.cursomc.domain.Cidade;
import com.erick.cursomc.domain.Cliente;
import com.erick.cursomc.domain.Endereco;
import com.erick.cursomc.domain.Estado;
import com.erick.cursomc.domain.ItemPedido;
import com.erick.cursomc.domain.Pagamento;
import com.erick.cursomc.domain.PagamentoComBoleto;
import com.erick.cursomc.domain.PagamentoComCartao;
import com.erick.cursomc.domain.Pedido;
import com.erick.cursomc.domain.Produto;
import com.erick.cursomc.domain.enums.EstadoPagamento;
import com.erick.cursomc.domain.enums.TipoCliente;
import com.erick.cursomc.repositories.CategoriaRepository;
import com.erick.cursomc.repositories.CidadeRepository;
import com.erick.cursomc.repositories.ClienteRepository;
import com.erick.cursomc.repositories.EnderecoRepository;
import com.erick.cursomc.repositories.EstadoRepository;
import com.erick.cursomc.repositories.ItemPedidoRepository;
import com.erick.cursomc.repositories.PagamentoRepository;
import com.erick.cursomc.repositories.PedidoRepository;
import com.erick.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {


	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
}
