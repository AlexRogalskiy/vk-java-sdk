// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Campaign object
 */
public class Campaign implements Validable {
    /**
     * Amount of active ads in campaign
     */
    @SerializedName("ads_count")
    private Integer adsCount;

    /**
     * Campaign's total limit, rubles
     */
    @SerializedName("all_limit")
    private String allLimit;

    /**
     * Campaign create time, as Unixtime
     */
    @SerializedName("create_time")
    private Integer createTime;

    /**
     * Campaign goal type
     */
    @SerializedName("goal_type")
    private Integer goalType;

    /**
     * Campaign user goal type
     */
    @SerializedName("user_goal_type")
    private Integer userGoalType;

    /**
     * Shows if Campaign Budget Optimization is on
     */
    @SerializedName("is_cbo_enabled")
    private Boolean isCboEnabled;

    /**
     * Campaign's day limit, rubles
     */
    @SerializedName("day_limit")
    private String dayLimit;

    /**
     * Campaign ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Campaign title
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Campaign start time, as Unixtime
     */
    @SerializedName("start_time")
    private Integer startTime;

    @SerializedName("status")
    @Required
    private CampaignStatus status;

    /**
     * Campaign stop time, as Unixtime
     */
    @SerializedName("stop_time")
    private Integer stopTime;

    @SerializedName("type")
    @Required
    private CampaignType type;

    /**
     * Campaign update time, as Unixtime
     */
    @SerializedName("update_time")
    private Integer updateTime;

    /**
     * Limit of views per user per campaign
     */
    @SerializedName("views_limit")
    private Integer viewsLimit;

    public Integer getAdsCount() {
        return adsCount;
    }

    public Campaign setAdsCount(Integer adsCount) {
        this.adsCount = adsCount;
        return this;
    }

    public String getAllLimit() {
        return allLimit;
    }

    public Campaign setAllLimit(String allLimit) {
        this.allLimit = allLimit;
        return this;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public Campaign setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getGoalType() {
        return goalType;
    }

    public Campaign setGoalType(Integer goalType) {
        this.goalType = goalType;
        return this;
    }

    public Integer getUserGoalType() {
        return userGoalType;
    }

    public Campaign setUserGoalType(Integer userGoalType) {
        this.userGoalType = userGoalType;
        return this;
    }

    public Boolean getIsCboEnabled() {
        return isCboEnabled;
    }

    public Campaign setIsCboEnabled(Boolean isCboEnabled) {
        this.isCboEnabled = isCboEnabled;
        return this;
    }

    public String getDayLimit() {
        return dayLimit;
    }

    public Campaign setDayLimit(String dayLimit) {
        this.dayLimit = dayLimit;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Campaign setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Campaign setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Campaign setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public CampaignStatus getStatus() {
        return status;
    }

    public Campaign setStatus(CampaignStatus status) {
        this.status = status;
        return this;
    }

    public Integer getStopTime() {
        return stopTime;
    }

    public Campaign setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    public CampaignType getType() {
        return type;
    }

    public Campaign setType(CampaignType type) {
        this.type = type;
        return this;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public Campaign setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getViewsLimit() {
        return viewsLimit;
    }

    public Campaign setViewsLimit(Integer viewsLimit) {
        this.viewsLimit = viewsLimit;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(goalType, allLimit, viewsLimit, updateTime, type, dayLimit, createTime, isCboEnabled, name, stopTime, startTime, id, adsCount, userGoalType, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campaign campaign = (Campaign) o;
        return Objects.equals(goalType, campaign.goalType) &&
                Objects.equals(stopTime, campaign.stopTime) &&
                Objects.equals(createTime, campaign.createTime) &&
                Objects.equals(isCboEnabled, campaign.isCboEnabled) &&
                Objects.equals(dayLimit, campaign.dayLimit) &&
                Objects.equals(viewsLimit, campaign.viewsLimit) &&
                Objects.equals(type, campaign.type) &&
                Objects.equals(allLimit, campaign.allLimit) &&
                Objects.equals(startTime, campaign.startTime) &&
                Objects.equals(updateTime, campaign.updateTime) &&
                Objects.equals(adsCount, campaign.adsCount) &&
                Objects.equals(name, campaign.name) &&
                Objects.equals(id, campaign.id) &&
                Objects.equals(userGoalType, campaign.userGoalType) &&
                Objects.equals(status, campaign.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Campaign{");
        sb.append("goalType=").append(goalType);
        sb.append(", stopTime=").append(stopTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", isCboEnabled=").append(isCboEnabled);
        sb.append(", dayLimit='").append(dayLimit).append("'");
        sb.append(", viewsLimit=").append(viewsLimit);
        sb.append(", type=").append(type);
        sb.append(", allLimit='").append(allLimit).append("'");
        sb.append(", startTime=").append(startTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", adsCount=").append(adsCount);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", userGoalType=").append(userGoalType);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
