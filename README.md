# typetalk-client

## Usage

```java
Client client = new Client("client_id", "client_secret");

// Get my profile
Profile pofile = client.getProfile();
System.out.println(profile.getAccount().getFullName());

// Post message
int topicId = 1000;
MessageParameter params = new MessageParameter("Hello, world!", null, null, null, null);
client.postMessage(topicId, params);
```
