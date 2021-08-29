package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() { return latitude; }
	
	public double getLongitude() { return longitude; }

	public static double distancia(Geo ponto1, Geo ponto2){
		int r = 6371;
		double lat1, lat2, long1, long2;
		double distancia, sinLat, sinLong, cosLat1, cosLat2, arcsin;
		
		lat1 = Math.toRadians(ponto1.getLatitude());
		long1 =Math.toRadians(ponto1.getLongitude());
		lat2 = Math.toRadians(ponto2.getLatitude());
		long2 =Math.toRadians(ponto2.getLongitude());

		sinLat = Math.pow(Math.sin((lat1-lat2)/2), 2);
		sinLong= Math.pow(Math.sin((long1-long2)/2), 2);
		cosLat1=Math.cos(lat1);
		cosLat2=Math.cos(lat2);
		
		arcsin = Math.asin(Math.sqrt(sinLat + sinLong * cosLat1 * cosLat2));
		distancia = 2*r * arcsin;

		return distancia;
	}

	public double distancia(Geo g1){
		Geo g2 = new Geo(latitude, longitude);

		return distancia(g1, g2);
	}
}
