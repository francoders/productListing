package cl.inacap.carroproductoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import cl.inacap.carroproductoapp.dto.Producto;

public class VerProductoActivity extends AppCompatActivity {

    private TextView nombreTxt;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_producto);
        this.toolbar = findViewById(R.id.toolbar);
        this.nombreTxt = findViewById(R.id.nombreProdTxt);
        this.setSupportActionBar(this.toolbar);
        if (getIntent() != null){
            //Me enviaron cosas y que vengo de otro activity
            Producto producto = (Producto)getIntent().getSerializableExtra("producto");
            this.nombreTxt.setText(producto.getNombre());
        }
    }
}