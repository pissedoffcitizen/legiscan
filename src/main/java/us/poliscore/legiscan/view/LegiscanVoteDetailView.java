
package us.poliscore.legiscan.view;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LegiscanVoteDetailView {
    
    @JsonProperty("people_id")
    private Integer peopleId;
    
    @JsonProperty("vote_id")
    private Integer voteId;
    
    public LegiscanVoteStatus getVote() {
    	return LegiscanVoteStatus.fromValue(voteId);
    }
    
    @JsonProperty("vote_text")
    private String voteText;
}
