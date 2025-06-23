package com.hms.insurance;

import java.util.Scanner;

public class InsuranceManager {
    private final ClaimService claimService;
    private final PolicyService policyService;
    private final InsuranceRepository repo;

    public InsuranceManager(InsuranceRepository repo) {
        this.repo = repo;
        this.claimService = new ClaimService(repo);
        this.policyService = new PolicyService(repo);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Insurance Console ===");
        System.out.print("Patient ID: ");
        String patientId = sc.nextLine();
        System.out.print("Policy ID: ");
        String policyId = sc.nextLine();
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        String claimId = "CLM" + System.currentTimeMillis();

        policyService.registerPolicy(policyId, patientId, "Discovery Health", 5000.00);
        claimService.submitClaim(claimId, patientId, policyId, amount);
        System.out.println("Done.");
    }
}
