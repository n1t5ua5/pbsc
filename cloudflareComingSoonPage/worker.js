addEventListener("fetch", event => {
  event.respondWith(handleRequest(event.request))
})

async function handleRequest(request) {
  const html = `
    <!DOCTYPE html>
    <html>
    <head>
      <title>Coming Soon</title>
      <style>
        body { font-family: sans-serif; text-align: center; padding: 100px; background: #f4f4f4; }
        h1 { color: #333; }
        p { color: #666; }
      </style>
    </head>
    <body>
      <h1>Something Great is Coming</h1>
      <p>This domain is under development. Stay tuned!</p>
    </body>
    </html>
  `
  return new Response(html, {
    headers: { "content-type": "text/html;charset=UTF-8" },
  })
}
