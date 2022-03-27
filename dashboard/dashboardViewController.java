/**
 * Sample Skeleton for 'dashboardView.fxml' Controller Class
 */

package dashboard;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class dashboardViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnSignUP"
    private Button btnSignUP; // Value injected by FXMLLoader

    @FXML // fx:id="btnLogin"
    private Button btnLogin; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegCustomer"
    private Button btnRegCustomer; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddProperty"
    private Button btnAddProperty; // Value injected by FXMLLoader

    @FXML // fx:id="btnCustomerDemand"
    private Button btnCustomerDemand; // Value injected by FXMLLoader

    @FXML // fx:id="btnGallery"
    private Button btnGallery; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchProperty"
    private Button btnSearchProperty; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchCustomer"
    private Button btnSearchCustomer; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegStatus"
    private Button btnRegStatus; // Value injected by FXMLLoader

    @FXML // fx:id="btnMaturedDeals"
    private Button btnMaturedDeals; // Value injected by FXMLLoader

    @FXML // fx:id="btnLogout"
    private Button btnLogout; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeveloper"
    private Button btnDeveloper; // Value injected by FXMLLoader

    @FXML
    void doAddProperty(ActionEvent event) {
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/availProperty/PropertyView.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	            
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

    }

    @FXML
    void doCustomerDemand(ActionEvent event) {
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/CustomerDemand/CustomerDemandView.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	            
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

    }

    @FXML
    void doDeveloper(ActionEvent event) {

    }

    @FXML
    void doGallery(ActionEvent event) {
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/galleryPic/galleryPic.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	           /* Scene scene1 = (Scene)btnGallery.getScene();
	            scene1.getWindow().hide();
*/
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

    }

    @FXML
    void doLogin(ActionEvent event) {
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/login/loginForm.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	            /*Scene scene1 = (Scene)btnLogin.getScene();
	            scene1.getWindow().hide();
	            */

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

    }

    @FXML
    void doLogout(ActionEvent event) {

    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/login/loginForm.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	            Scene scene1 = (Scene)btnLogout.getScene();
	            scene1.getWindow().hide();
	            

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
    }

    @FXML
    void doMaturedDeals(ActionEvent event) {
    	
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/dealsMatured/dealsMaturedView.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	           /* Scene scene1 = (Scene)btnMaturedDeals.getScene();
	            scene1.getWindow().hide();
	            */

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

    }

    @FXML
    void doRegCustomer(ActionEvent event) {
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/customer/CustomerRegisterView.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	           /* Scene scene1 = (Scene)btnRegCustomer.getScene();
	            scene1.getWindow().hide();
*/

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 


    }

    @FXML
    void doRegStatus(ActionEvent event) {
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/registrationStatus/registrationStatus.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	           /* Scene scene1 = (Scene)btnRegStatus.getScene();
	            scene1.getWindow().hide();
	            */

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
    	
    	

    }

    @FXML
    void doSearchCustomer(ActionEvent event) {

    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/customerView/customerView.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	           /* Scene scene1 = (Scene)btnSearchCustomer.getScene();
	            scene1.getWindow().hide();
	            
	            */

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
    }

    @FXML
    void doSearchProperty(ActionEvent event) {
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/searchProperty/searchPropertyView.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();

	           /* Scene scene1 = (Scene)btnSearchProperty.getScene();
	            scene1.getWindow().hide();
	            */

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

    }

    @FXML
    void doSignUP(ActionEvent event) {
    	try{
			  FXMLLoader fxmlloader= new FXMLLoader(getClass().getResource("/signup/signupForm.fxml"));
	        	Parent root=(Parent)fxmlloader.load();
	        	
	        	Stage stage=new Stage();
	        	stage.setScene(new Scene(root));
	        	stage.show();
				/*
				  Scene scene1 = (Scene)btnSignUP.getScene(); scene1.getWindow().hide();
				 */
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        

    }
}
