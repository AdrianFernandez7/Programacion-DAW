import actividadferroviaria.Maquinista;
import actividadferroviaria.Mecanicos;
import actividadferroviaria.Tren;
import actividadferroviaria.Vagon;
import actividadferroviaria.Especialidad;
import actividadferroviaria.Locomotora;

public class ActividadFerroviaria {
    public static void main(String[] args) {
        
        Maquinista maquinista1 = new Maquinista("Pedro",3457474,3400,4);
        Maquinista maquinista2 = new Maquinista("Alvaro",345758754,2500,3);
        Maquinista maquinista3 = new Maquinista("Pablo",3459294,1800,1);

        Mecanicos mecanico1 = new Mecanicos("36363G",67584938, Especialidad.frenos);
        Mecanicos mecanico2 = new Mecanicos("278247H",67554438, Especialidad.hidráulica);
        Mecanicos mecanico3 = new Mecanicos("81893N",67584538, Especialidad.electricidad);

        Vagon vagon1 = new Vagon(3,3000,2000,"Peligrosa");
        Vagon vagon2 = new Vagon(4,3500,1200,"No peligrosa");
        Vagon vagon3 = new Vagon(2,8000,3700,"Peligrosa");

        Locomotora locomotora1 = new Locomotora(39493,8700,1989,mecanico1);
        Locomotora locomotora2 = new Locomotora(33563,9000,1998,mecanico2);
        Locomotora locomotora3 = new Locomotora(99303,17300,2024,mecanico3);

        Tren tren1 = new Tren(locomotora1,vagon1,maquinista1);
        Tren tren2 = new Tren(locomotora2,vagon2,maquinista2);
        Tren tren3 = new Tren(locomotora3,vagon3,maquinista3);

        System.out.println(tren1);
        System.out.println(tren2);
        System.out.println(tren3);

        
    }
    
}
