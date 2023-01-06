// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A2A provider specific settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2AReplicationIntentDetails extends ReplicationProtectionIntentProviderSpecificSettings {
    /*
     * The fabric specific object Id of the virtual machine.
     */
    @JsonProperty(value = "fabricObjectId")
    private String fabricObjectId;

    /*
     * The primary location for the virtual machine.
     */
    @JsonProperty(value = "primaryLocation")
    private String primaryLocation;

    /*
     * The recovery location for the virtual machine.
     */
    @JsonProperty(value = "recoveryLocation")
    private String recoveryLocation;

    /*
     * The recovery subscription Id of the virtual machine.
     */
    @JsonProperty(value = "recoverySubscriptionId")
    private String recoverySubscriptionId;

    /*
     * The list of vm disk details.
     */
    @JsonProperty(value = "vmDisks")
    private List<A2AProtectionIntentDiskInputDetails> vmDisks;

    /*
     * The list of vm managed disk details.
     */
    @JsonProperty(value = "vmManagedDisks")
    private List<A2AProtectionIntentManagedDiskInputDetails> vmManagedDisks;

    /*
     * The recovery resource group id.
     */
    @JsonProperty(value = "recoveryResourceGroupId")
    private String recoveryResourceGroupId;

    /*
     * The protection profile custom details.
     */
    @JsonProperty(value = "protectionProfile")
    private ProtectionProfileCustomDetails protectionProfile;

    /*
     * The primary staging storage account details.
     */
    @JsonProperty(value = "primaryStagingStorageAccount")
    private StorageAccountCustomDetails primaryStagingStorageAccount;

    /*
     * The recovery availability set details.
     */
    @JsonProperty(value = "recoveryAvailabilitySet")
    private RecoveryAvailabilitySetCustomDetails recoveryAvailabilitySet;

    /*
     * The recovery virtual network details.
     */
    @JsonProperty(value = "recoveryVirtualNetwork")
    private RecoveryVirtualNetworkCustomDetails recoveryVirtualNetwork;

    /*
     * The recovery proximity placement group custom details.
     */
    @JsonProperty(value = "recoveryProximityPlacementGroup")
    private RecoveryProximityPlacementGroupCustomDetails recoveryProximityPlacementGroup;

    /*
     * A value indicating whether the auto protection is enabled.
     */
    @JsonProperty(value = "autoProtectionOfDataDisk")
    private AutoProtectionOfDataDisk autoProtectionOfDataDisk;

    /*
     * The multi vm group name.
     */
    @JsonProperty(value = "multiVmGroupName")
    private String multiVmGroupName;

    /*
     * The multi vm group id.
     */
    @JsonProperty(value = "multiVmGroupId")
    private String multiVmGroupId;

    /*
     * The boot diagnostic storage account.
     */
    @JsonProperty(value = "recoveryBootDiagStorageAccount")
    private StorageAccountCustomDetails recoveryBootDiagStorageAccount;

    /*
     * The recovery disk encryption information (for two pass flows).
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /*
     * The recovery availability zone.
     */
    @JsonProperty(value = "recoveryAvailabilityZone")
    private String recoveryAvailabilityZone;

    /*
     * The recovery availability type of the virtual machine.
     */
    @JsonProperty(value = "recoveryAvailabilityType", required = true)
    private String recoveryAvailabilityType;

    /*
     * A value indicating whether the auto update is enabled.
     */
    @JsonProperty(value = "agentAutoUpdateStatus")
    private AgentAutoUpdateStatus agentAutoUpdateStatus;

    /*
     * The automation account arm id.
     */
    @JsonProperty(value = "automationAccountArmId")
    private String automationAccountArmId;

    /*
     * A value indicating the type authentication to use for automation Account.
     */
    @JsonProperty(value = "automationAccountAuthenticationType")
    private AutomationAccountAuthenticationType automationAccountAuthenticationType;

    /** Creates an instance of A2AReplicationIntentDetails class. */
    public A2AReplicationIntentDetails() {
    }

    /**
     * Get the fabricObjectId property: The fabric specific object Id of the virtual machine.
     *
     * @return the fabricObjectId value.
     */
    public String fabricObjectId() {
        return this.fabricObjectId;
    }

    /**
     * Set the fabricObjectId property: The fabric specific object Id of the virtual machine.
     *
     * @param fabricObjectId the fabricObjectId value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withFabricObjectId(String fabricObjectId) {
        this.fabricObjectId = fabricObjectId;
        return this;
    }

    /**
     * Get the primaryLocation property: The primary location for the virtual machine.
     *
     * @return the primaryLocation value.
     */
    public String primaryLocation() {
        return this.primaryLocation;
    }

    /**
     * Set the primaryLocation property: The primary location for the virtual machine.
     *
     * @param primaryLocation the primaryLocation value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withPrimaryLocation(String primaryLocation) {
        this.primaryLocation = primaryLocation;
        return this;
    }

    /**
     * Get the recoveryLocation property: The recovery location for the virtual machine.
     *
     * @return the recoveryLocation value.
     */
    public String recoveryLocation() {
        return this.recoveryLocation;
    }

    /**
     * Set the recoveryLocation property: The recovery location for the virtual machine.
     *
     * @param recoveryLocation the recoveryLocation value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoveryLocation(String recoveryLocation) {
        this.recoveryLocation = recoveryLocation;
        return this;
    }

    /**
     * Get the recoverySubscriptionId property: The recovery subscription Id of the virtual machine.
     *
     * @return the recoverySubscriptionId value.
     */
    public String recoverySubscriptionId() {
        return this.recoverySubscriptionId;
    }

    /**
     * Set the recoverySubscriptionId property: The recovery subscription Id of the virtual machine.
     *
     * @param recoverySubscriptionId the recoverySubscriptionId value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoverySubscriptionId(String recoverySubscriptionId) {
        this.recoverySubscriptionId = recoverySubscriptionId;
        return this;
    }

    /**
     * Get the vmDisks property: The list of vm disk details.
     *
     * @return the vmDisks value.
     */
    public List<A2AProtectionIntentDiskInputDetails> vmDisks() {
        return this.vmDisks;
    }

    /**
     * Set the vmDisks property: The list of vm disk details.
     *
     * @param vmDisks the vmDisks value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withVmDisks(List<A2AProtectionIntentDiskInputDetails> vmDisks) {
        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get the vmManagedDisks property: The list of vm managed disk details.
     *
     * @return the vmManagedDisks value.
     */
    public List<A2AProtectionIntentManagedDiskInputDetails> vmManagedDisks() {
        return this.vmManagedDisks;
    }

    /**
     * Set the vmManagedDisks property: The list of vm managed disk details.
     *
     * @param vmManagedDisks the vmManagedDisks value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withVmManagedDisks(
        List<A2AProtectionIntentManagedDiskInputDetails> vmManagedDisks) {
        this.vmManagedDisks = vmManagedDisks;
        return this;
    }

    /**
     * Get the recoveryResourceGroupId property: The recovery resource group id.
     *
     * @return the recoveryResourceGroupId value.
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recoveryResourceGroupId property: The recovery resource group id.
     *
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the protectionProfile property: The protection profile custom details.
     *
     * @return the protectionProfile value.
     */
    public ProtectionProfileCustomDetails protectionProfile() {
        return this.protectionProfile;
    }

    /**
     * Set the protectionProfile property: The protection profile custom details.
     *
     * @param protectionProfile the protectionProfile value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withProtectionProfile(ProtectionProfileCustomDetails protectionProfile) {
        this.protectionProfile = protectionProfile;
        return this;
    }

    /**
     * Get the primaryStagingStorageAccount property: The primary staging storage account details.
     *
     * @return the primaryStagingStorageAccount value.
     */
    public StorageAccountCustomDetails primaryStagingStorageAccount() {
        return this.primaryStagingStorageAccount;
    }

    /**
     * Set the primaryStagingStorageAccount property: The primary staging storage account details.
     *
     * @param primaryStagingStorageAccount the primaryStagingStorageAccount value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withPrimaryStagingStorageAccount(
        StorageAccountCustomDetails primaryStagingStorageAccount) {
        this.primaryStagingStorageAccount = primaryStagingStorageAccount;
        return this;
    }

    /**
     * Get the recoveryAvailabilitySet property: The recovery availability set details.
     *
     * @return the recoveryAvailabilitySet value.
     */
    public RecoveryAvailabilitySetCustomDetails recoveryAvailabilitySet() {
        return this.recoveryAvailabilitySet;
    }

    /**
     * Set the recoveryAvailabilitySet property: The recovery availability set details.
     *
     * @param recoveryAvailabilitySet the recoveryAvailabilitySet value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoveryAvailabilitySet(
        RecoveryAvailabilitySetCustomDetails recoveryAvailabilitySet) {
        this.recoveryAvailabilitySet = recoveryAvailabilitySet;
        return this;
    }

    /**
     * Get the recoveryVirtualNetwork property: The recovery virtual network details.
     *
     * @return the recoveryVirtualNetwork value.
     */
    public RecoveryVirtualNetworkCustomDetails recoveryVirtualNetwork() {
        return this.recoveryVirtualNetwork;
    }

    /**
     * Set the recoveryVirtualNetwork property: The recovery virtual network details.
     *
     * @param recoveryVirtualNetwork the recoveryVirtualNetwork value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoveryVirtualNetwork(
        RecoveryVirtualNetworkCustomDetails recoveryVirtualNetwork) {
        this.recoveryVirtualNetwork = recoveryVirtualNetwork;
        return this;
    }

    /**
     * Get the recoveryProximityPlacementGroup property: The recovery proximity placement group custom details.
     *
     * @return the recoveryProximityPlacementGroup value.
     */
    public RecoveryProximityPlacementGroupCustomDetails recoveryProximityPlacementGroup() {
        return this.recoveryProximityPlacementGroup;
    }

    /**
     * Set the recoveryProximityPlacementGroup property: The recovery proximity placement group custom details.
     *
     * @param recoveryProximityPlacementGroup the recoveryProximityPlacementGroup value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoveryProximityPlacementGroup(
        RecoveryProximityPlacementGroupCustomDetails recoveryProximityPlacementGroup) {
        this.recoveryProximityPlacementGroup = recoveryProximityPlacementGroup;
        return this;
    }

    /**
     * Get the autoProtectionOfDataDisk property: A value indicating whether the auto protection is enabled.
     *
     * @return the autoProtectionOfDataDisk value.
     */
    public AutoProtectionOfDataDisk autoProtectionOfDataDisk() {
        return this.autoProtectionOfDataDisk;
    }

    /**
     * Set the autoProtectionOfDataDisk property: A value indicating whether the auto protection is enabled.
     *
     * @param autoProtectionOfDataDisk the autoProtectionOfDataDisk value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withAutoProtectionOfDataDisk(AutoProtectionOfDataDisk autoProtectionOfDataDisk) {
        this.autoProtectionOfDataDisk = autoProtectionOfDataDisk;
        return this;
    }

    /**
     * Get the multiVmGroupName property: The multi vm group name.
     *
     * @return the multiVmGroupName value.
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multiVmGroupName property: The multi vm group name.
     *
     * @param multiVmGroupName the multiVmGroupName value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get the multiVmGroupId property: The multi vm group id.
     *
     * @return the multiVmGroupId value.
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multiVmGroupId property: The multi vm group id.
     *
     * @param multiVmGroupId the multiVmGroupId value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the recoveryBootDiagStorageAccount property: The boot diagnostic storage account.
     *
     * @return the recoveryBootDiagStorageAccount value.
     */
    public StorageAccountCustomDetails recoveryBootDiagStorageAccount() {
        return this.recoveryBootDiagStorageAccount;
    }

    /**
     * Set the recoveryBootDiagStorageAccount property: The boot diagnostic storage account.
     *
     * @param recoveryBootDiagStorageAccount the recoveryBootDiagStorageAccount value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoveryBootDiagStorageAccount(
        StorageAccountCustomDetails recoveryBootDiagStorageAccount) {
        this.recoveryBootDiagStorageAccount = recoveryBootDiagStorageAccount;
        return this;
    }

    /**
     * Get the diskEncryptionInfo property: The recovery disk encryption information (for two pass flows).
     *
     * @return the diskEncryptionInfo value.
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the diskEncryptionInfo property: The recovery disk encryption information (for two pass flows).
     *
     * @param diskEncryptionInfo the diskEncryptionInfo value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

    /**
     * Get the recoveryAvailabilityZone property: The recovery availability zone.
     *
     * @return the recoveryAvailabilityZone value.
     */
    public String recoveryAvailabilityZone() {
        return this.recoveryAvailabilityZone;
    }

    /**
     * Set the recoveryAvailabilityZone property: The recovery availability zone.
     *
     * @param recoveryAvailabilityZone the recoveryAvailabilityZone value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoveryAvailabilityZone(String recoveryAvailabilityZone) {
        this.recoveryAvailabilityZone = recoveryAvailabilityZone;
        return this;
    }

    /**
     * Get the recoveryAvailabilityType property: The recovery availability type of the virtual machine.
     *
     * @return the recoveryAvailabilityType value.
     */
    public String recoveryAvailabilityType() {
        return this.recoveryAvailabilityType;
    }

    /**
     * Set the recoveryAvailabilityType property: The recovery availability type of the virtual machine.
     *
     * @param recoveryAvailabilityType the recoveryAvailabilityType value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withRecoveryAvailabilityType(String recoveryAvailabilityType) {
        this.recoveryAvailabilityType = recoveryAvailabilityType;
        return this;
    }

    /**
     * Get the agentAutoUpdateStatus property: A value indicating whether the auto update is enabled.
     *
     * @return the agentAutoUpdateStatus value.
     */
    public AgentAutoUpdateStatus agentAutoUpdateStatus() {
        return this.agentAutoUpdateStatus;
    }

    /**
     * Set the agentAutoUpdateStatus property: A value indicating whether the auto update is enabled.
     *
     * @param agentAutoUpdateStatus the agentAutoUpdateStatus value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withAgentAutoUpdateStatus(AgentAutoUpdateStatus agentAutoUpdateStatus) {
        this.agentAutoUpdateStatus = agentAutoUpdateStatus;
        return this;
    }

    /**
     * Get the automationAccountArmId property: The automation account arm id.
     *
     * @return the automationAccountArmId value.
     */
    public String automationAccountArmId() {
        return this.automationAccountArmId;
    }

    /**
     * Set the automationAccountArmId property: The automation account arm id.
     *
     * @param automationAccountArmId the automationAccountArmId value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withAutomationAccountArmId(String automationAccountArmId) {
        this.automationAccountArmId = automationAccountArmId;
        return this;
    }

    /**
     * Get the automationAccountAuthenticationType property: A value indicating the type authentication to use for
     * automation Account.
     *
     * @return the automationAccountAuthenticationType value.
     */
    public AutomationAccountAuthenticationType automationAccountAuthenticationType() {
        return this.automationAccountAuthenticationType;
    }

    /**
     * Set the automationAccountAuthenticationType property: A value indicating the type authentication to use for
     * automation Account.
     *
     * @param automationAccountAuthenticationType the automationAccountAuthenticationType value to set.
     * @return the A2AReplicationIntentDetails object itself.
     */
    public A2AReplicationIntentDetails withAutomationAccountAuthenticationType(
        AutomationAccountAuthenticationType automationAccountAuthenticationType) {
        this.automationAccountAuthenticationType = automationAccountAuthenticationType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (vmDisks() != null) {
            vmDisks().forEach(e -> e.validate());
        }
        if (vmManagedDisks() != null) {
            vmManagedDisks().forEach(e -> e.validate());
        }
        if (protectionProfile() != null) {
            protectionProfile().validate();
        }
        if (primaryStagingStorageAccount() != null) {
            primaryStagingStorageAccount().validate();
        }
        if (recoveryAvailabilitySet() != null) {
            recoveryAvailabilitySet().validate();
        }
        if (recoveryVirtualNetwork() != null) {
            recoveryVirtualNetwork().validate();
        }
        if (recoveryProximityPlacementGroup() != null) {
            recoveryProximityPlacementGroup().validate();
        }
        if (recoveryBootDiagStorageAccount() != null) {
            recoveryBootDiagStorageAccount().validate();
        }
        if (diskEncryptionInfo() != null) {
            diskEncryptionInfo().validate();
        }
        if (recoveryAvailabilityType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property recoveryAvailabilityType in model A2AReplicationIntentDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(A2AReplicationIntentDetails.class);
}