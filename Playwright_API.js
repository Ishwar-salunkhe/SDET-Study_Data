//Sample Get Request 
test("Get Useres", async ({request}) => {
    const response  = await request.get("https://reqres.in/api/users?page=2");
    console.log(await response.json());
    const statusCode = await response.status();
    expect(statusCode).toBe(200);
    const time  = await response.timing();  //we can validate time as well
    console.log(time);
    const statusText = await response.statusText();  //validate statusText
    console.log(statusText);  //Output: OK
})

//POST Request
test("Post Request Create user" , async ({request}) => {
    const response = await request.post("https://reqres.in/api/users",
                      {
                       data:{
                          "name":"Virat",
                          "job":"Cricketer"
                       } 
                      });
                 
    console.log(await response.json());
    expect(await response.status()).toBe(201);                  
})

