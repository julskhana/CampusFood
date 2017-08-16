package com.example.julian.proyecto_android_app;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Cliente_HTTP extends AsyncTask {
    private Context mContext;
    ProgressDialog mDialog;
    AlertDialog.Builder alerta;

    public Cliente_HTTP(Context m){
        this.mContext=m;
        alerta = new AlertDialog.Builder(mContext);

    }

    @Override
    protected void onProgressUpdate(Object... params) {
        super.onProgressUpdate(params[0]);

        alerta.setTitle("Resultado");
        alerta.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {public void onClick(DialogInterface dialog, int which) {}});
        alerta.setMessage(params[0].toString());
        alerta.show();
    }

    @Override
    protected Object doInBackground(Object... params) {
        try{
            String mensaje = insertar((com.example.julian.proyecto_android_app.Restaurante)params[0]);
            this.publishProgress(mensaje);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return null;
    }

    @Override
    protected void onPreExecute() {

    }

    public String insertar(Restaurante r) throws URISyntaxException, UnsupportedEncodingException {
        String nombre       = r.getNombre();
        String ubicacion    = r.getUbicacion();
        String descripcion  = r.getDescripcion();
        int capacidad       = r.getCapacidad();
        String hora         = r.getHorario();
        int puntos          = r.getPuntuacion();
        String mensaje      = "";

        try {
            URL url = new URL("http://172.20.142.146:8080/WebAppProyecto/IngresoEquipo?nombre="+nombre+"&ubicacion="+ubicacion+"&descripcion="+descripcion+"&capacidad="+capacidad+"&hora="+hora+"&puntos="+puntos+"".replace(" ","%20"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            System.out.println("Response Code: " + conn.getResponseCode());
            InputStream in = new BufferedInputStream(conn.getInputStream());
            String xmlString = org.apache.commons.io.IOUtils.toString(in, "UTF-8");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = factory.newDocumentBuilder();
            InputSource inStream = new InputSource();
            inStream.setCharacterStream(new StringReader(xmlString));
            Document doc = db.parse(inStream);
            NodeList nl = doc.getElementsByTagName("mensaje");
            org.w3c.dom.Element nameElement = (org.w3c.dom.Element) nl.item(0);
            mensaje = nameElement.getFirstChild().getNodeValue().trim();
        }catch(Exception e){
            mensaje = "Error";
        }
        return mensaje;
    }
}
