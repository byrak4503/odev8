package homework4;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {
	

	@Override
	public boolean CheckIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
				try {
					return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalIdentity()), player.getName().toUpperCase(),
							player.getSurname().toUpperCase(), player.getDateOfBirth().getWeekYear());
				} catch (RemoteException e) {
		
					e.printStackTrace();
				}
				return false;
			}

}
