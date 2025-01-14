// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetConversationByIdExtended object
 */
public class GetConversationByIdExtended extends GetConversationById implements Validable {
    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetConversationByIdExtended setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetConversationByIdExtended setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetConversationByIdExtended getConversationByIdExtended = (GetConversationByIdExtended) o;
        return Objects.equals(profiles, getConversationByIdExtended.profiles) &&
                Objects.equals(groups, getConversationByIdExtended.groups);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetConversationByIdExtended{");
        sb.append("profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
