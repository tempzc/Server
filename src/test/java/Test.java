import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ilodo.utils.ConvertUtils;
import com.lf.lfopen.webservices.domain.workoutresult.json.CardioWorkoutProgress;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressWorkout;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressWorkoutData;

public class Test {
	public static void main(String[] args) {
		String xmlResponse = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns2:resultProgressWorkout xmlns:ns2=\"http://api.lfopen.lfconnect.com/v1/workoutresult\" xmlns:ns3=\"http://api.lfopen.lfconnect.com/v1/workoutpreset\"><resultWorkoutData><calorie>47.0</calorie><cardioDataDetails><calorie>2.0</calorie><date>2015-11-10T21:39:06Z</date><distance>0.0138</distance><duration>1.0333333333333334</duration></cardioDataDetails><cardioDataDetails><calorie>28.0</calorie><date>2015-11-10T21:48:15Z</date><distance>0.4171</distance><duration>6.216666666666667</duration></cardioDataDetails><cardioDataDetails><calorie>7.0</calorie><date>2015-11-10T22:31:59Z</date><distance>0.083</distance><duration>1.85</duration></cardioDataDetails><cardioDataDetails><calorie>10.0</calorie><date>2015-11-10T22:34:10Z</date><distance>0.0693</distance><duration>0.8166666666666667</duration></cardioDataDetails><distance>0.5832</distance><duration>9.916666666666666</duration><equipmentId>1</equipmentId><equipmentName>Treadmill</equipmentName><unit>M</unit></resultWorkoutData><resultWorkoutData><calorie>14.0</calorie><cardioDataDetails><calorie>14.0</calorie><date>2015-11-10T23:19:02Z</date><distance>0.4923</distance><duration>1.8</duration></cardioDataDetails><distance>0.4923</distance><duration>1.8</duration><equipmentId>3</equipmentId><equipmentName>Recumbent Bike</equipmentName><unit>M</unit></resultWorkoutData><resultWorkoutData><calorie>7.0</calorie><cardioDataDetails><calorie>7.0</calorie><date>2015-11-10T23:24:54Z</date><distance>0.1657</distance><duration>0.8833333333333333</duration></cardioDataDetails><distance>0.1657</distance><duration>0.8833333333333333</duration><equipmentId>4</equipmentId><equipmentName>Cross-Trainer</equipmentName><unit>M</unit></resultWorkoutData></ns2:resultProgressWorkout>";

		try {
			ResultProgressWorkout list = ConvertUtils.xmlStringToBean(xmlResponse, ResultProgressWorkout.class);
			System.out.println(list);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
