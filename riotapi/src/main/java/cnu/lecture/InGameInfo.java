package cnu.lecture;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by tchi on 2016. 4. 25..
 */
public class InGameInfo {
    public static class Observer {
        @Getter @Setter
        private String encryptionKey;
        
        public String getEncryptionKey(){
        	return encryptionKey;
        }
        
        public void setEncryptionKey(String inputKeyValue){
        	encryptionKey = inputKeyValue;
        }
    }

    public static class Participant {
        @Getter @Setter
        private String summonerName;
        
        public String getSummonerName(){
        	return summonerName;
        }
        
        public void setSummonerName(String inputSummonerName){
        	summonerName = inputSummonerName;
        }
    }

    @Getter @Setter
    private String platformId;
    
    public void setPlatformId(String inputPlatformId){
    	this.platformId = inputPlatformId;
    }
    
	public String getPlatformId() {
		return platformId;
	}
    
    @Getter @Setter
    private Observer observers;
    
    public Observer getObservers(){
    	return observers;
    }
    
    public void setObservers(Observer inputObservers){
    	this.observers = inputObservers;
    }
    
    @Getter @Setter
    private Participant[] participants;

	public Participant[] getParticipants() {
		return participants;
	}

	public void setParticipants(Participant[] participants) {
		this.participants = participants;
	}


    
}
