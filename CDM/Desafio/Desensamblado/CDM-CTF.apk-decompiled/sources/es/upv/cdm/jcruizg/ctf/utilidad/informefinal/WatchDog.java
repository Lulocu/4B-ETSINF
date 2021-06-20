package es.upv.cdm.jcruizg.ctf.utilidad.informefinal;

import java.io.Serializable;
import java.util.HashMap;

public class WatchDog implements Serializable {
    public static final String SEPARADOR_EVENTOS = "^";
    public static final String SEPARADOR_PARTES = ".";
    public static final HashMap<CLASS, String> classIDs = new HashMap<>();
    public static final HashMap<EVENT, String> eventIDs = new HashMap<>();
    public static final StringBuffer traza = new StringBuffer();

    public enum CLASS {
        Bienvenida,
        Credenciales,
        Informacion,
        Mensaje,
        Pista,
        Solucion,
        GestorCredenciales,
        Pistas,
        Test
    }

    public enum EVENT {
        IN,
        OUT,
        USUARIO_OK,
        USUARIO_KO,
        f3CONTRASEA_OK,
        f2CONTRASEA_KO,
        MENSAJE_MOSTRADO,
        SOLUCION,
        PULSACIONES_OK,
        PULSACIONES_KO,
        BANDERA_OK,
        BANDERA_KO,
        CREDENTIALS_OK,
        CREDENTIALS_KO,
        BACKDOOR_FOUND,
        PISTA_1,
        PISTA_2,
        PISTA_3,
        PISTA_4,
        PISTA_5,
        PISTA_6,
        PISTA_6_Visible,
        CIDE_ACTIVADO,
        BANDERA_ENCONTRADA
    }

    public static void initializeHashMaps() {
        StringBuffer stringBuffer = traza;
        stringBuffer.delete(0, stringBuffer.length());
        HashMap<CLASS, String> hashMap = classIDs;
        hashMap.clear();
        HashMap<EVENT, String> hashMap2 = eventIDs;
        hashMap2.clear();
        hashMap.put(CLASS.Bienvenida, "3002dbe0-4194-11e9-b210-d663bd873d93");
        hashMap.put(CLASS.Credenciales, "caa34f1a-3f62-11e9-b210-d663bd873d93");
        hashMap.put(CLASS.Informacion, "caa351e0-3f62-11e9-b210-d663bd873d93");
        hashMap.put(CLASS.Mensaje, "caa356a4-3f62-11e9-b210-d663bd873d93");
        hashMap.put(CLASS.Pista, "caa3582a-3f62-11e9-b210-d663bd873d93");
        hashMap.put(CLASS.Solucion, "caa3596a-3f62-11e9-b210-d663bd873d93");
        hashMap.put(CLASS.GestorCredenciales, "f1bde382-3f6a-11e9-b210-d663bd873d93");
        hashMap.put(CLASS.Pistas, "3002e068-4194-11e9-b210-d663bd873d93");
        hashMap.put(CLASS.Test, "b2f1e9a5-279b-4f8a-bec5-4221a388b7d5");
        hashMap2.put(EVENT.IN, "3002dee2-4194-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.OUT, "46effecc-4195-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.USUARIO_OK, "a607800a-3f66-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.f3CONTRASEA_OK, "a60783fc-3f66-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PULSACIONES_OK, "a6078672-3f66-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.BANDERA_OK, "a60788ca-3f66-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.CREDENTIALS_OK, "a6078e60-3f66-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.BACKDOOR_FOUND, "f1bde634-3f6a-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.USUARIO_KO, "1435da22-3f6c-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.f2CONTRASEA_KO, "1435dbe4-3f6c-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.CREDENTIALS_KO, "1435ddd8-3f6c-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PULSACIONES_KO, "1435dfcc-3f6c-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.BANDERA_KO, "fee67806-3f6c-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.MENSAJE_MOSTRADO, "fee67ad6-3f6c-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.SOLUCION, "947cc2f8-3fef-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PISTA_1, "f1bdf1b0-3f6a-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PISTA_2, "f1bdf354-3f6a-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PISTA_3, "f1bdf49e-3f6a-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PISTA_4, "1435d658-3f6c-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PISTA_5, "94553866-4029-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PISTA_6, "94553b04-4029-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.PISTA_6_Visible, "944c1678-4196-11e9-b210-d663bd873d93");
        hashMap2.put(EVENT.CIDE_ACTIVADO, "1cbd72ad-b96b-448e-9ce6-956005785383");
        hashMap2.put(EVENT.BANDERA_ENCONTRADA, "20c34924-193d-406c-bbc6-aa3f78213be8");
    }

    public static void addTraza(CLASS r2, EVENT event) {
        traza.append(classIDs.get(r2) + SEPARADOR_PARTES + eventIDs.get(event) + SEPARADOR_EVENTOS);
    }

    public static void addTraza(CLASS r2, EVENT event, String str) {
        traza.append(classIDs.get(r2) + SEPARADOR_PARTES + eventIDs.get(event) + SEPARADOR_PARTES + str + SEPARADOR_EVENTOS);
    }
}
