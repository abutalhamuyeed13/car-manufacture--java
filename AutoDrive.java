package carManufacturerManagementSystem;

public class AutoDrive{
	private boolean isNetActivated;
	private boolean isVoiceCommandActivated;
	
	public AutoDrive() {
		isNetActivated= false;
    	isVoiceCommandActivated= false;
	}
	
    public AutoDrive(boolean isNetActivated, boolean isVoiceCommandActivated) {
    	this.isNetActivated= isNetActivated;
    	this.isVoiceCommandActivated= isVoiceCommandActivated;
	}
	
	public void netActivation() {
		if(isNetActivated == false)
			isNetActivated = true;
	}
	
	public void voiceCommandActivation() {
		if(isVoiceCommandActivated == false)
			isVoiceCommandActivated = true;
	}	
}