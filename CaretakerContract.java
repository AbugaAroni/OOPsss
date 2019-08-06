/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmanagementsystem;

/**
 *
 * @author Abuga Aroni
 */
public class CaretakerContract {
    private int CContractNo;
    private String Start;
    private String End;
    //foreign keys below
    private int CaretakerID; 
    private int HouseNo;
    
    //constructor
    
public CaretakerContract (int CCNo, String CStart, String CEnd, int CId, int HNumber) 
{ CContractNo = CCNo;
  Start = CStart;
  End = CEnd;
  CaretakerID = CId;
  HouseNo = HNumber;
}
//setters and getters
    public int getCContractNo() {
        return CContractNo;
    }

    public void setCContractNo(int CContractNo) {
        this.CContractNo = CContractNo;
    }

    public String getStart() {
        return Start;
    }

    public void setStart(String Start) {
        this.Start = Start;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String End) {
        this.End = End;
    }

    public int getCaretakerID() {
        return CaretakerID;
    }

    public void setCaretakerID(int CaretakerID) {
        this.CaretakerID = CaretakerID;
    }

    public int getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(int HouseNo) {
        this.HouseNo = HouseNo;
    }

}
