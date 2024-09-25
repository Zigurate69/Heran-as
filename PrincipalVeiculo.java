package Herança;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		
		//Criando um veiculo
		Veiculo veiculo = new Veiculo("Lamborghini", "Aventador",2024,"Fibra de Carbono");
		System.out.println("Veiculo:");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		//Criando um automovel
		Automovel automovel = new Automovel("McLaren", "Senna",2018,"Fibra de Carbono",2,"V8 Biturbo");
		System.out.println("\nAutomovel:");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Numero de Portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		//Criando uma Moto
		Moto moto = new Moto("Harley Davidson", "Heritage Classic",2024,"Vivid Black",0);
		System.out.println("\nMoto:");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindradas: " + moto.getCilindrada());
		
		
	}
}