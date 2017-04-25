package com.example.imc;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	
      EditText edt_altura;
      EditText edt_peso;
	
	
	  Button bt_verificar;

	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edt_altura =  (EditText)findViewById(R.id.edt_altura);

		edt_peso =  (EditText)findViewById(R.id.edt_peso);  
		
		bt_verificar = (Button)findViewById(R.id.bt_verificar);
		bt_verificar.setOnClickListener(verificar);
		
		
		
		
	}
	
	
	
	
View.OnClickListener verificar = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			double imc,altura,peso;
			String categoriaIMC;
			
			altura = Double.parseDouble(edt_altura.getText().toString());
			peso = Double.parseDouble(edt_peso.getText().toString());
			
		
			imc = peso / (altura * altura);
			
			
			
			
			
		
			if (imc < 18.5)
			{
				categoriaIMC = "Abaixo do peso";

			}
			else if ((imc > 18.5) && (imc <= 24.9))
			{
				categoriaIMC = "Peso Normal";
			}
			else if((imc > 25)&&(imc<=29.9))
			{
				categoriaIMC = "Sobrepeso";	
			}
			else if((imc > 30)&&(imc<=34.9))
			{
				categoriaIMC = "Obesidade grau I";
			}
			else if((imc > 35)&&(imc<=39.9))
			{
				categoriaIMC = "Obesidade grau II";
			}
			else
			{
				categoriaIMC = "Obesidade grau III";
			}
			
			//A classe Toast é usada para mostrar uma mensagem na tela
			Toast.makeText(getBaseContext(), "Você tem um IMC considerado:  " + categoriaIMC, Toast.LENGTH_SHORT).show();


			
		
			
		
			
			
			
			
			
			
		}
		
		
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
