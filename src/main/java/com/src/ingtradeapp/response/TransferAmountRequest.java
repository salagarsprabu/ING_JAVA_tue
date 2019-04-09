package com.src.ingtradeapp.response;

import org.springframework.stereotype.Component;

@Component
public class TransferAmountRequest {
	private String srcAcct;
	private String destAcct;
	private Double transferAmount;

	public String getSrcAcct() {
		return srcAcct;
	}

	public void setSrcAcct(String srcAcct) {
		this.srcAcct = srcAcct;
	}

	public String getDestAcct() {
		return destAcct;
	}

	public void setDestAcct(String destAcct) {
		this.destAcct = destAcct;
	}

	public Double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(Double transferAmount) {
		this.transferAmount = transferAmount;
	}
}
