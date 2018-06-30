package tn.triforce.soscall.Utils;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.HashMap;

import tn.triforce.soscall.DataModel;
import tn.triforce.soscall.R;

/**
 * Created by noure on 22/12/2017.
 */
public class Utils {
    public static HashMap dictionary;
    private static Utils ourInstance = new Utils();

    private Utils() {
    }

    public static Utils getInstance() {
        dictionary = new HashMap();

        //Tunisia
        ArrayList<DataModel> arrayListTunisia = new ArrayList<>();
        arrayListTunisia.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "190"));
        arrayListTunisia.add(new DataModel(R.string.TN_TNG, R.drawable.ic_guard, R.color.sos2, "193"));
        arrayListTunisia.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "197"));
        arrayListTunisia.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "198"));
        arrayListTunisia.add(new DataModel(R.string.TN_contreTerrorisme, R.drawable.ic_sos, R.color.sos5, "80 101 111"));

        //Algeria
        ArrayList<DataModel> arrayListAlgeria = new ArrayList<>();
        arrayListAlgeria.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "041403131"));
        arrayListAlgeria.add(new DataModel(R.string.DZ_GN, R.drawable.ic_guard, R.color.sos2, "1023"));
        arrayListAlgeria.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "1548"));
        arrayListAlgeria.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "14"));
        arrayListAlgeria.add(new DataModel(R.string.CHILDREN, R.drawable.ic_sos, R.color.sos5, "3033"));

        //Morocco
        ArrayList<DataModel> arrayListMorocco = new ArrayList<>();
        arrayListMorocco.add(new DataModel(R.string.MA_SAMU, R.drawable.ic_samu, R.color.sos1, "150"));
        arrayListMorocco.add(new DataModel(R.string.MA_Police, R.drawable.ic_police, R.color.sos3, "190"));
        arrayListMorocco.add(new DataModel(R.string.MA_GR, R.drawable.ic_guard, R.color.sos2, "177"));

        //France
        ArrayList<DataModel> arrayListFrance = new ArrayList<>();
        arrayListFrance.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "15"));
        arrayListFrance.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos2, "17"));
        arrayListFrance.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "18"));
        arrayListFrance.add(new DataModel(R.string.FR_EUR, R.drawable.ic_sos, R.color.sos3, "112"));
        arrayListFrance.add(new DataModel(R.string.FR_DEAF, R.drawable.ic_sos, R.color.sos5, "114"));
        arrayListFrance.add(new DataModel(R.string.FR_SDF, R.drawable.ic_sos, R.color.sos6, "115"));
        arrayListFrance.add(new DataModel(R.string.CHILDREN, R.drawable.ic_sos, R.color.sos7, "119"));

        //USA Canada MEXICO
        ArrayList<DataModel> arrayListUSA_CA_MX = new ArrayList<>();
        arrayListUSA_CA_MX.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos4, "911"));

        //South Africa
        ArrayList<DataModel> arrayListSouth_Africa = new ArrayList<>();
        arrayListSouth_Africa.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "999"));
        arrayListSouth_Africa.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "10111"));

        //DEUSTCH
        ArrayList<DataModel> arrayListDeustch = new ArrayList<>();
        arrayListDeustch.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "110"));
        arrayListDeustch.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "112"));

        //ITALY
        ArrayList<DataModel> arrayListItaly = new ArrayList<>();
        arrayListItaly.add(new DataModel(R.string.IT_rifleman, R.drawable.ic_guard, R.color.sos2, "112"));
        arrayListItaly.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "113"));
        arrayListItaly.add(new DataModel(R.string.IT_children_emergency, R.drawable.ic_sos, R.color.sos5, "114"));
        arrayListItaly.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "115"));
        arrayListItaly.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "118"));

        //TURKEY
        ArrayList<DataModel> arrayListTurkey = new ArrayList<>();
        arrayListTurkey.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos1, "110"));
        arrayListTurkey.add(new DataModel(R.string.protectionCivile, R.drawable.ic_firetruck, R.color.sos4, "112"));
        arrayListTurkey.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos3, "155"));

        //PORTUGAL
        ArrayList<DataModel> arrayListPortugal = new ArrayList<>();
        arrayListPortugal.add(new DataModel(R.string.rescue, R.drawable.ic_police, R.color.sos1, "112"));
        arrayListPortugal.add(new DataModel(R.string.PT_FOREST_FIRE, R.drawable.ic_firetruck, R.color.sos4, "117"));
        arrayListPortugal.add(new DataModel(R.string.samu, R.drawable.ic_samu, R.color.sos2, "808 242424"));
        arrayListPortugal.add(new DataModel(R.string.PT_HELP, R.drawable.ic_sos, R.color.sos5, "118"));
        arrayListPortugal.add(new DataModel(R.string.PT_TOURIST, R.drawable.ic_sos, R.color.sos4, "800 296296"));
        arrayListPortugal.add(new DataModel(R.string.CHILDREN, R.drawable.ic_sos, R.color.sos3, "213 433333"));

        dictionary.put(Constants.TUNISIA, arrayListTunisia);
        dictionary.put(Constants.ALGERIA, arrayListAlgeria);
        dictionary.put(Constants.MAROCCO, arrayListMorocco);
        dictionary.put(Constants.FRANCE, arrayListFrance);
        dictionary.put(Constants.USA, arrayListUSA_CA_MX);
        dictionary.put(Constants.CANADA, arrayListUSA_CA_MX);
        dictionary.put(Constants.MEXICO, arrayListUSA_CA_MX);
        dictionary.put(Constants.SOUTH_AFRICA, arrayListSouth_Africa);
        dictionary.put(Constants.DEUSTCH, arrayListDeustch);
        dictionary.put(Constants.ITALY, arrayListItaly);
        dictionary.put(Constants.TURKEY, arrayListPortugal);
        dictionary.put(Constants.PORTUGAL, arrayListPortugal);
        return ourInstance;
    }

    public static final String getPathAssetFlag(String countryCode) {
        return Constants.ASSETS_PATH + countryCode + ".png";
    }

    public static void shareAction(String text, Context context) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, text);
        sendIntent.setType("text/plain");
        context.startActivity(Intent.createChooser(sendIntent, context.getString(R.string.share)));
    }

    public static void contactAction(Context context) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, Constants.Email_DEVELOPER);
        intent.putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.text_add_country_request));
        intent.putExtra(Intent.EXTRA_TEXT, "");

        context.startActivity(Intent.createChooser(intent, context.getString(R.string.contact)));
    }
}
