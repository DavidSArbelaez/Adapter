package epsadaptor;

public class AdaptadorEPS {

    eps AdaptadorEPS;

    public void RegistrarAfiliacion(Cliente cl) {
        AdaptadorEPS.registrarCliente(cl);
    }

    public void Desafiliar(int cedula) {
        AdaptadorEPS.desafiliar(cedula);
    }

    public void RealizarPago(Cliente cl) {
        AdaptadorEPS.cobrarCita(cl);
    }

    public void ConsultarPago(Cliente cl) {
        AdaptadorEPS.ConsultarPago(cl);
    }

    public void ConsultarAfiliacion(int cedula) {
        AdaptadorEPS.buscarCliente(cedula);
    }
}
