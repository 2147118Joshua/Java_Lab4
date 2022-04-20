import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.crypto.KeyAgreement;

public class DairyDraw {
    static int SumCharges;
    static int Sal1;
    static float Sal2;

    public static void main(String[] args) {
        DairyAdmin DairyAdmin = new DairyAdmin();
        DairyEmployee DairyEmployee = new DairyEmployee();
        DairyMember DairyMember = new DairyMember();
        MilkSupplyReport MilkSupplyReport = new MilkSupplyReport();
        RateCardReport RateCardReport = new RateCardReport();
        Cattle Cattle = new Cattle();
        CattleData CattleData = new CattleData();
        FeedsStock FeedsStock = new FeedsStock();
        MilkingManagement MilkingManagement = new MilkingManagement();
        ManureManagement ManureManagement = new ManureManagement();
        Hospitality Hospitality = new Hospitality();
        Sales Sales = new Sales();
        paymentMilker pay = new paymentMilker();

        DairyAdmin.DairyAdmin_Details(123, 12, 779523352, "Joshua", "hannur", "Kar", "kar");
        DairyAdmin.DisplayDairyAdminDetails();

        Sal2 = pay.calc(2.2f, 101.5f);
        Sal1 = pay.calc(3, 100);
        SumCharges = pay.calc(4, 100, 35);
        // int calc(int milkQualityRate,int Amount)
        // float calc(float milkQualityRate,float Amount)

        System.out.println("Total Salary Including Charges : " + SumCharges);
        System.out.println("Decimal Values : " + Sal2);
        System.out.println("Sal in int : " + Sal1);

    }
}

class DairyAdmin {
    int DairyID, Age, PhoneNumber;
    String AdminName, Taluk, State, Address;

    public void DairyAdmin_Details(int DairyID, int Age, int PhoneNumber,
            String AdminName, String Taluk, String State, String Address) {
        this.DairyID = DairyID;
        this.AdminName = AdminName;
        this.Age = Age;
        this.Taluk = Taluk;
        this.State = State;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
    }

    void DisplayDairyAdminDetails() {
        System.out.println(DairyID + " This is the dairy ID ");
    }

}

class DairyEmployee {
    String EmployeeName, EmployeeAddress, EmployeeIncharge;
    int DairyID, EmployeeID, EmployeeAge, EmployeePhoneNumber;

    public void DairyEmployee_Details(String EmployeeName, String EmployeeAddress, String EmployeeIncharge,
            int DairyID, int EmployeeID, int EmployeeAge, int EmployeePhoneNumber) {
        this.DairyID = DairyID;
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.EmployeeAge = EmployeeAge;
        this.EmployeeAddress = EmployeeAddress;
        this.EmployeePhoneNumber = EmployeePhoneNumber;
        this.EmployeeIncharge = EmployeeIncharge;

    }

}

class DairyMember {
    String MemberName, MemberAddress;
    int DairyID, MemberID, MemberCattleID;

    public void DairyMember_Details(String MemberName, String MemberAddress,
            int DairyID, int MemberID, int MemberCattleID) {
        this.DairyID = DairyID;
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.MemberAddress = MemberAddress;
        this.MemberCattleID = MemberCattleID;
    }
}

class MilkSupplyReport {
    String MemberName;
    int DairyID, MemberID, LitersOfMilkDelivered;
    Date DateOfMilkSupplied;

    public void MilkSupplyReport_Details(String MemberName,
            int DairyID, int MemberID, int LitersOfMilkDelivered,
            Date DateOfMilkSupplied) {
        this.DairyID = DairyID;
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.DateOfMilkSupplied = DateOfMilkSupplied;
        this.LitersOfMilkDelivered = LitersOfMilkDelivered;

    }

}

class MilkingManagement {
    int MemberID, CattleID, EmployeeID;
    Time TimeAtWork;

    public void MilkingManagement_Details(int MemberID, int CattleID, int EmployeeID,
            Time timeAtWorkTime) {
        this.MemberID = MemberID;
        this.CattleID = CattleID;
        this.EmployeeID = EmployeeID;
        this.TimeAtWork = TimeAtWork;
    }

}

class RateCardReport {
    int DairyID, MemberID, RatechartEntry;
    float FATbase, FATandSNFbase;

    public void RateCardReport_Details(int DairyID, int MemberID, int RatechartEntry,
            float FATbase, float FATandSNFbase) {
        this.DairyID = DairyID;
        this.MemberID = MemberID;
        this.FATbase = FATbase;
        this.FATandSNFbase = FATandSNFbase;
        this.RatechartEntry = RatechartEntry;

    }
}

class Cattle {
    int DairyID, MemberID, CattleID, EmployeeID, TotalPopulation;
    String Type;

    public void Cattle_Details(int DairyID, int MemberID, int CattleID, int EmployeeID, int TotalPopulation,
            String Type) {
        this.DairyID = DairyID;
        this.MemberID = MemberID;
        this.CattleID = CattleID;
        this.EmployeeID = EmployeeID;
        this.Type = Type;
        this.TotalPopulation = TotalPopulation;
    }
}

class CattleData {

}

class FeedsStock {

}

class ManureManagement {

}

class Hospitality {

}

class Sales {

}

class paymentMilker {
    String Name;
    int milkQualityRate, Amount, Charges;

    public void paymentDetails(String Name, int milkQualityRate, int Amount, int Charges) {
        this.Name = Name;
        this.milkQualityRate = milkQualityRate;
        this.Amount = Amount;
        this.Charges = Charges;
    }

    int calc(int milkQualityRate, int Amount) {
        return (milkQualityRate + Amount);
    }

    float calc(float milkQualityRate, float Amount) {
        return (milkQualityRate + Amount);
    }

    int calc(int milkQualityRate, int Amount, int Charges) {
        return (milkQualityRate + Amount + Charges);
    }

}
