package pe.edu.cibertec.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.modelo.entities.Pedido;
import pe.edu.cibertec.repository.PedidoRepository;

@Service
public class PedidoServicesImpl implements IntPedidoServices {

	@Autowired
	private PedidoRepository prepo;

	@Override
	public List<Pedido> findAll() {
		return prepo.findAll();
	}

	@Override
	public Pedido findById(int idPedido) {
		return prepo.findById(idPedido).orElse(null);
	}

	@Override
	public List<Pedido> findByComercial(int idComercial) {
		return prepo.pedidosDeComercial(idComercial);
	}

	@Override
	public List<Pedido> pedidosDeComercial(int idComercial) {
		try {
			return this.prepo.pedidosDeComercial(idComercial);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
